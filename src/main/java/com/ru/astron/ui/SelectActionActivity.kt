package com.ru.astron.ui

import android.Manifest
import android.app.Activity
import android.app.Dialog
import android.app.PendingIntent
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.ContactsContract
import android.support.design.widget.NavigationView
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.util.Log
import android.util.Pair
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.*
import com.ru.astron.Config
import com.ru.astron.ConfigRequests
import com.ru.astron.R
import com.ru.astron.adapters.SelectActionRecyclerAdapter
import com.ru.astron.entities.*
import com.ru.astron.models.ContactAccount
import com.ru.astron.models.ContactPhone
import com.ru.astron.models.SelectActionViewModel
import com.ru.astron.services.QuickConversationsService
import com.ru.astron.services.XmppConnectionService
import com.ru.astron.ui.util.AvatarWorkerTask
import com.ru.astron.ui.util.JidDialog
import com.ru.astron.ui.util.MenuDoubleTabUtil
import com.ru.astron.utils.*
import kotlinx.android.synthetic.main.activity_select_action.*
import org.joda.time.DateTime
import rocks.xmpp.addr.Jid
import java.util.*
import java.text.SimpleDateFormat


class SelectActionActivity : XmppActivity(), XmppConnectionService.OnRosterUpdate,
    CreatePrivateGroupChatDialog.CreateConferenceDialogListener, JoinConferenceDialog.JoinConferenceDialogListener,
    CreatePublicChannelDialog.CreatePublicChannelDialogListener {

    private val REQUEST_PERMISION_CODE = 6688
    private val REQUEST_CREATE_CONFERENCE = 0x39da
    private val REQUEST_SYNC_CONTACTS = 0x28cf

    private var mPostponedActivityResult: Pair<Int, Intent>? = null

    private val contacts = mutableListOf<ListItem>()
    private var toggle: ActionBarDrawerToggle? = null
    private lateinit var model: SelectActionViewModel
    private var sdf = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
    private val mActivatedAccounts = mutableListOf<String>()
    private var mAccount: Account? = null

    private val mAdhocConferenceCallback = object : UiCallback<Conversation> {
        override fun success(conversation: Conversation) {
            runOnUiThread {
                hideToast()
                switchToConversation(conversation)
            }
        }

        override fun error(errorCode: Int, `object`: Conversation) {
            runOnUiThread { replaceToast(getString(errorCode)) }
        }

        override fun userInputRequried(pi: PendingIntent, `object`: Conversation) {

        }
    }

    override fun refreshUiReal() {
        loadContactList()
    }

    override fun onRosterUpdate() {
        this.refreshUi()
    }

    override fun onBackendConnected() {
        //подключились к сервису
        if (mPostponedActivityResult != null) {
            onActivityResult(mPostponedActivityResult!!.first, Activity.RESULT_OK, mPostponedActivityResult!!.second)
            this.mPostponedActivityResult = null
        }

        mActivatedAccounts.clear();
        for (account in xmppConnectionService.accounts) {
            if (account.status != Account.State.DISABLED) {
                mActivatedAccounts.add(account.jid.local)
            }
        }
        loadContactList()

        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_CONTACTS
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            xmppConnectionService.loadPhoneContacts()
            xmppConnectionService.startContactObserver()
        }
        displayAccountInformation()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        ContactDateTimeHelper.updateCurrentDateTime()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_action)

        setSupportActionBar(toolbar as Toolbar)
        ActionBarActivity.configureActionBar(supportActionBar)
        //title = resources.getString(R.string.select_action_title)
        val pressBack = this.invalidateActionBarTitle()

        if (!pressBack) {
            toggle = ActionBarDrawerToggle(
                this,
                drawer_layout,
                toolbar as Toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
            )
            drawer_layout.addDrawerListener(toggle!!)
            toggle?.setDrawerIndicatorEnabled(true)
            toggle?.syncState()
            toggle?.setToolbarNavigationClickListener {

                finish()
            }
            displayAccountInformation()
        }


        model = ViewModelProviders.of(this).get(SelectActionViewModel::class.java)

        configureRecycler()
        requestPermissionContact()
    }
    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun invalidateActionBarTitle(): Boolean {
        val actionBar = supportActionBar
        if (actionBar != null) {
            val i = intent.getBooleanExtra("SHOW_BACK_KEY", false)
            if (i) {//если нужно отображать кнопку назад

                actionBar.setTitle(resources.getString(R.string.select_action_title))
                actionBar.setDisplayHomeAsUpEnabled(false)
                if (drawer_layout != null) drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                toggle?.setDrawerIndicatorEnabled(false)
                toggle?.syncState()
                actionBar.setDisplayHomeAsUpEnabled(true)

                return true
            }

            //иначе показать боковую панель
            actionBar.setTitle(R.string.app_name)
            actionBar.setDisplayHomeAsUpEnabled(false)

            if (drawer_layout != null) drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            toggle?.setDrawerIndicatorEnabled(true)
            toggle?.syncState()
        }
        return false
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (MenuDoubleTabUtil.shouldIgnoreTap()) {
            return false
        }
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun loadContactList() {
        if (!xmppConnectionServiceBound) return

        contacts.clear()
        val accounts = xmppConnectionService.getAccounts()
        for (account in accounts) {
            if (account.getStatus() == Account.State.DISABLED) continue
            for (contact in account.getRoster().getContacts()) {
                if (contact.showInContactList()) contacts.add(contact)
            }
        }
        onUpdateContacts()
    }

    private fun onUpdateContacts() {
        model.setContacts(contacts)
        model.rebuildRecyclerList()
        (recycler.adapter as SelectActionRecyclerAdapter).apply {
            setItems(model.recyclerList)
            notifyDataSetChanged()
        }
    }

    private fun onUpdatePhonesBook() {
        model.rebuildRecyclerList()
        (recycler.adapter as SelectActionRecyclerAdapter).apply {
            setItems(model.recyclerList)
            notifyDataSetChanged()
        }
    }

    private fun configureRecycler() {
        recycler.adapter = SelectActionRecyclerAdapter().apply {
            setItems(model.recyclerList)
            onContactClick = { v -> onContactClickListener(v) }
            onAddressBookClick = { v -> onAddressBookClickListener(v) }
            onMenuClick = { v -> onMenuRecyclerSelector(v) }
            onContactPopUp = { c, v -> onContactPopUpMenu(c, v) }
        }
        recycler.layoutManager = LinearLayoutManager(this)
    }

    private fun onContactClickListener(contact: ListItem?) {
        contact ?: return
        val account = xmppConnectionService.accounts[0]
        val contactC = account.getRoster().getContact(contact.jid)
        //val lastseen = contactC.lastseen
        switchToConversation(contactC)
    }

    private fun onAddressBookClickListener(phone: String?) {
        phone ?: return
        if (!xmppConnectionServiceBound) return

        val account = xmppConnectionService.accounts[0]
        val contactC = account.getRoster().getContact(JidUtil.createJid(phone + "@" + Config.DOMAIN_LOCK))
        if (contactC.isSelf()) {
            switchToConversation(contactC)
        } else if (contactC.showInRoster()) {
            switchToConversation(contactC)
            //throw new EnterJidDialog.JidError(getString(R.string.contact_already_exists));
        } else {
            xmppConnectionService.createContact(contactC, true)
            switchToConversationDoNotAppend(contactC, null)
        }
    }

    internal fun switchToConversationDoNotAppend(contact: Contact, body: String?) {
        val conversation = xmppConnectionService.findOrCreateConversation(contact.account, contact.jid, false, true)
        switchToConversationDoNotAppend(conversation, body)
    }

    internal fun switchToConversation(contact: Contact) {
        val conversation = xmppConnectionService.findOrCreateConversation(contact.account, contact.jid, false, true)
        switchToConversation(conversation)
    }

    private fun requestPermissionContact() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_CONTACTS
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            PermisionContactGranted()
        } else {
            //запросить разрешение
            ActivityCompat.requestPermissions(
                this,
                arrayOf<String>(Manifest.permission.READ_CONTACTS),
                REQUEST_SYNC_CONTACTS
            )
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (grantResults.size > 0)
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                ScanActivity.onRequestPermissionResult(this, requestCode, grantResults)
                if (requestCode == REQUEST_SYNC_CONTACTS) {
                    PermisionContactGranted()
                }
            }
    }

    private fun PermisionContactGranted() {
        if (xmppConnectionServiceBound) {
            xmppConnectionService.loadPhoneContacts()
            xmppConnectionService.startContactObserver()
        }
        //Разрешение на чтение контактов предоставлено
        //можно читать
        Log.v("Read contacts:", "Разрешение на чтение контактов предоставлено пользователем");
        reloadAddressBook()
        onUpdatePhonesBook()
        //configureRecycler()
    }

    private fun reloadAddressBook() {
        val cursor = contentResolver.query(
            ContactPhone.CONTENT_URI,
            arrayOf(ContactPhone.DISPLAY_NAME, ContactPhone.PHONE_NUMBER, ContactPhone.PHOTO_FULL_URI),
            null, null, null
        )
        if (cursor == null) {
            finish();return;
        }//Нету контактов
        if (cursor.getCount() == 0) {
            finish();return;
        }//Нету контактов
        model.reloadAddressBook(cursor)
        cursor.close()
    }

    private fun onMenuRecyclerSelector(item: Int) {
        when (item) {
            R.id.join_public_channel -> {
                showJoinConferenceDialog()
            }
            R.id.create_public_channel -> {
                showPublicChannelDialog()
            }
            R.id.create_private_group_chat -> {
                showCreatePrivateGroupChatDialog()
            }
        }
    }

    protected fun showJoinConferenceDialog() {
        val ft = supportFragmentManager.beginTransaction()
        val prev = supportFragmentManager.findFragmentByTag(FRAGMENT_TAG_DIALOG)
        if (prev != null) {
            ft.remove(prev)
        }

        ft.addToBackStack(null)
        val joinConferenceFragment = JoinConferenceDialog.newInstance(null, mActivatedAccounts)
        joinConferenceFragment.show(ft, FRAGMENT_TAG_DIALOG)
    }

    private fun showPublicChannelDialog() {
        val ft = supportFragmentManager.beginTransaction()
        val prev = supportFragmentManager.findFragmentByTag(XmppActivity.FRAGMENT_TAG_DIALOG)
        if (prev != null) {
            ft.remove(prev)
        }
        ft.addToBackStack(null)
        val dialog = CreatePublicChannelDialog.newInstance(mActivatedAccounts)
        dialog.show(ft, XmppActivity.FRAGMENT_TAG_DIALOG)
    }

    override fun onJoinDialogPositiveClick(
        dialog: Dialog,
        spinner: Spinner,
        jid: EditText,
        isBookmarkChecked: Boolean
    ) {
        if (!xmppConnectionServiceBound) {
            return
        }
        val account = getSelectedAccount(this, spinner) ?: return
        val conferenceJid: Jid
        try {
            conferenceJid = JidUtil.of(jid.text.toString() + "@conference." + Config.DOMAIN_LOCK)
        } catch (e: IllegalArgumentException) {
            jid.error = getString(R.string.invalid_jid)
            return
        }

        if (isBookmarkChecked) {
            if (account.hasBookmarkFor(conferenceJid)) {
                jid.error = getString(R.string.bookmark_already_exists)
            } else {
                val bookmark = Bookmark(account, conferenceJid.asBareJid())
                bookmark.setAutojoin(getBooleanPreference("autojoin", R.bool.autojoin))
                val nick = conferenceJid.resource
                if (nick != null && !nick.isEmpty()) {
                    bookmark.nick = nick
                }
                account.getBookmarks().add(bookmark)
                xmppConnectionService.pushBookmarks(account)
                val conversation = xmppConnectionService
                    .findOrCreateConversation(account, conferenceJid, true, true, true)
                bookmark.conversation = conversation
                dialog.dismiss()
                switchToConversation(conversation)
            }
        } else {
            val conversation = xmppConnectionService
                .findOrCreateConversation(account, conferenceJid, true, true, true)
            dialog.dismiss()
            switchToConversation(conversation)
        }
    }

    fun getSelectedAccount(context: Context, spinner: Spinner?): Account? {
        if (spinner == null || !spinner.isEnabled) {
            return null
        }
        if (context is XmppActivity) {
            val jid: Jid
            try {
                jid = JidUtil.of(spinner.selectedItem as String, Config.DOMAIN_LOCK, null)
            } catch (e: IllegalArgumentException) {
                return null
            }

            val service = context.xmppConnectionService ?: return null
            return service.findAccountByJid(jid)
        } else {
            return null
        }
    }

    override fun onCreatePublicChannel(account: Account, name: String, address: Jid) {
        mToast = Toast.makeText(this, R.string.creating_channel, Toast.LENGTH_LONG)
        mToast.show()
        xmppConnectionService.createPublicChannel(account, name, address, object : UiCallback<Conversation> {
            override fun success(conversation: Conversation) {
                runOnUiThread {
                    hideToast()
                    switchToConversation(conversation)
                }

            }

            override fun error(errorCode: Int, conversation: Conversation) {
                runOnUiThread {
                    replaceToast(getString(errorCode))
                    switchToConversation(conversation)
                }
            }

            override fun userInputRequried(pi: PendingIntent, `object`: Conversation) {

            }
        })
    }

    private fun showCreatePrivateGroupChatDialog() {
        val ft = supportFragmentManager.beginTransaction()
        val prev = supportFragmentManager.findFragmentByTag(XmppActivity.FRAGMENT_TAG_DIALOG)
        if (prev != null) {
            ft.remove(prev)
        }
        ft.addToBackStack(null)
        val createConferenceFragment = CreatePrivateGroupChatDialog.newInstance(mActivatedAccounts)
        createConferenceFragment.show(ft, XmppActivity.FRAGMENT_TAG_DIALOG)
    }

    override fun onCreateDialogPositiveClick(spinner: Spinner, name: String) {
        if (!xmppConnectionServiceBound) {
            return
        }
        val account = getSelectedAccount(this, spinner) ?: return
        val intent = Intent(applicationContext, ChooseContactActivity::class.java)
        intent.putExtra(ChooseContactActivity.EXTRA_SHOW_ENTER_JID, false)
        intent.putExtra(ChooseContactActivity.EXTRA_SELECT_MULTIPLE, true)
        intent.putExtra(ChooseContactActivity.EXTRA_GROUP_CHAT_NAME, name.trim { it <= ' ' })
        intent.putExtra(ChooseContactActivity.EXTRA_ACCOUNT, account.jid.asBareJid().toString())
        intent.putExtra(ChooseContactActivity.EXTRA_TITLE_RES_ID, R.string.choose_participants)
        startActivityForResult(intent, REQUEST_CREATE_CONFERENCE)
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            if (xmppConnectionServiceBound) {
                this.mPostponedActivityResult = null
                if (requestCode == REQUEST_CREATE_CONFERENCE) {
                    val account = extractAccount(intent)
                    val name = intent!!.getStringExtra(ChooseContactActivity.EXTRA_GROUP_CHAT_NAME)
                    val jids = ChooseContactActivity.extractJabberIds(intent)
                    if (account != null && jids.size > 0) {
                        if (xmppConnectionService.createAdhocConference(
                                account,
                                name,
                                jids,
                                mAdhocConferenceCallback
                            )
                        ) {
                            mToast = Toast.makeText(this, R.string.creating_conference, Toast.LENGTH_LONG)
                            mToast.show()
                        }
                    }
                }
            } else {
                this.mPostponedActivityResult = Pair<Int, Intent>(requestCode, intent)
            }
        }
        super.onActivityResult(requestCode, requestCode, intent)
    }

    private fun onContactPopUpMenu(c: ContactAccount, view: View) {
        val popup = PopupMenu(this, view)
        popup.inflate(R.menu.contact_context)

        val account = xmppConnectionService.accounts[0]
        val contact = account.getRoster().getContact(c.contact?.jid)


        val blockUnblockItem = popup.menu.findItem(R.id.context_contact_block_unblock)
        val showContactDetailsItem = popup.menu.findItem(R.id.context_contact_details)
        val deleteContactMenuItem = popup.menu.findItem(R.id.context_delete_contact)
        if (contact.isSelf) {
            showContactDetailsItem.setVisible(false)
        }
        deleteContactMenuItem.setVisible(contact.showInRoster() && !contact.getOption(Contact.Options.SYNCED_VIA_OTHER))
        val xmpp = contact.account.xmppConnection
        if (xmpp != null && xmpp.features.blocking() && !contact.isSelf) {
            if (contact.isBlocked) {
                blockUnblockItem.setTitle(R.string.unblock_contact)
            } else {
                blockUnblockItem.setTitle(R.string.block_contact)
            }
        } else {
            blockUnblockItem.setVisible(false)
        }

        popup.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.context_contact_details -> switchToContactDetails(contact)
                R.id.context_contact_block_unblock -> BlockContactDialog.show(this, contact)
                R.id.context_delete_contact -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setNegativeButton(R.string.cancel, null)
                    builder.setTitle(R.string.action_delete_contact)
                    builder.setMessage(
                        JidDialog.style(
                            this,
                            R.string.remove_contact_text,
                            contact.jid.toEscapedString()
                        )
                    )
                    builder.setPositiveButton(R.string.delete) { dialog, which ->
                        xmppConnectionService.deleteContactOnServer(contact)
                        loadContactList()
                    }
                    builder.create().show()
                }
            }
            false
        }

        popup.show()
    }

    private fun displayAccountInformation() {
        if (xmppConnectionService == null) return
        if (mAccount == null) {
            mAccount = AccountUtils.getFirst(xmppConnectionService)
        }

        val nv = findViewById<View>(R.id.nav_view) as NavigationView
        val iv = nv.findViewById<View>(R.id.photo) as ImageView
        AvatarWorkerTask.loadAvatar(mAccount, iv, R.dimen.nav_avatar_size)

        val phone = nv.findViewById<View>(R.id.phone) as TextView?
        val account_name = nv.findViewById<View>(R.id.account_name) as TextView?

        val name = mAccount!!.getDisplayName()
        if (phone != null) phone.text = ParsePhoneNumber.parse(mAccount?.getJid()?.getLocal())
        if (name.isEmpty()) {
            if (account_name != null && phone != null) {
                account_name.text = ParsePhoneNumber.parse(mAccount?.getJid()?.getLocal())
                phone.visibility = View.GONE
            }
        } else {
            if (account_name != null && phone != null) {
                account_name.setText(name)
                phone.visibility = View.VISIBLE
            }
        }

        nv.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_settings -> startActivity(Intent(this@SelectActionActivity, SettingsActivity::class.java))
                R.id.action_account -> AccountUtils.launchManageAccount(this@SelectActionActivity)
                R.id.action_search -> startActivity(Intent(this@SelectActionActivity, SearchActivity::class.java))
                R.id.join_public_channel -> showJoinConferenceDialog()
                R.id.create_public_channel -> showPublicChannelDialog()
                R.id.create_private_group_chat -> showCreatePrivateGroupChatDialog()
                R.id.create_contact -> showCreateContactDialog()
                //R.id.create_contact_from_address_book -> showCreateContactFromAddressBook(null)
                R.id.news -> startActivityForResult(
                    Intent(this, NewsActivity::class.java),
                    ConfigRequests.REQUEST_ADD_CHANNEL
                )
                R.id.channels -> {
                    val intent = Intent(this, NewsActivity::class.java)
                    intent.putExtra("url", "http://channel.astron.world/feed/")
                    intent.putExtra("title", resources.getString(R.string.channels_title))
                    startActivityForResult(intent, ConfigRequests.REQUEST_ADD_CHANNEL)
                }
                R.id.bot -> addBotContact()
            }/*case R.id.select:
                Intent intent_select = new Intent(this, SelectActionActivity.class);
                startActivity(intent_select);
                break;*/


            drawer_layout.closeDrawers()
            true
        }
    }
    protected fun showCreateContactDialog() {
        val ft = supportFragmentManager.beginTransaction()
        val prev = supportFragmentManager.findFragmentByTag(XmppActivity.FRAGMENT_TAG_DIALOG)
        if (prev !=
            null
        ) {
            ft.remove(prev)
        }
        ft.addToBackStack(null)
        val dialog = EnterJidDialog.newInstance(
            mActivatedAccounts,
            getString(R.string.add_contact),
            getString(R.string.add), null, null,
            true
        )
        dialog.setOnEnterJidDialogPositiveListener { accountJid, contactJid ->

            if (!xmppConnectionServiceBound) {
                false
            } else {

                val account = xmppConnectionService.findAccountByJid(accountJid)
                if (account == null) {
                    true
                } else {

                    val contact = account.roster.getContact(contactJid)
                    if (contact.isSelf) {
                        switchToConversation(contact)
                        true
                    } else if (contact.showInRoster()) {
                        throw EnterJidDialog.JidError(getString(R.string.contact_already_exists))
                    } else {
                        xmppConnectionService.createContact(contact, true)
                        switchToConversationDoNotAppend(contact, null)
                        true
                    }
                }
            }
        }
        dialog.show(ft, XmppActivity.FRAGMENT_TAG_DIALOG)
    }

    private fun addBotContact() {
        if (xmppConnectionServiceBound) {
            val contactJid = "VerterBot@astron.online"
            if (mActivatedAccounts.size >= 1) {
                val accountJid = mActivatedAccounts[0]
                Log.v("PHONE", accountJid)
                addPhoneContact(contactJid, accountJid)
            }
        }
    }
    private fun addPhoneContact(cJid: String, aJid: String): Boolean {
        val accountJid = JidUtil.of(aJid, Config.DOMAIN_LOCK, null)
        val contactJid = JidUtil.of(cJid)

        if (!xmppConnectionServiceBound) {
            return false
        }

        val account = xmppConnectionService.findAccountByJid(accountJid) ?: return true

        val contact = account.roster.getContact(contactJid)
        if (contact.isSelf) {
            switchToConversation(contact)
            return true
        } else {
            xmppConnectionService.createContact(contact, true)
            switchToConversationDoNotAppend(contact, null)
            return true
        }
    }

}

