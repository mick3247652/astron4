package com.ru.astron.ui

import android.Manifest
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.ru.astron.R
import com.ru.astron.models.PhoneSelectViewModel
import com.ru.astron.ui.ActionBarActivity.configureActionBar
import com.ru.astron.ui.util.MenuDoubleTabUtil
import kotlinx.android.synthetic.main.activity_phone_select.*
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.support.v4.app.ActivityCompat
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.ru.astron.adapters.PhoneSelectRecyclerAdapter
import com.ru.astron.models.ContactPhone
import android.content.Intent
import android.app.Activity


class PhoneSelectActivity : AppCompatActivity() {
    private lateinit var model: PhoneSelectViewModel
    private val REQUEST_PERMISION_CODE = 6688

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_select)
        model = ViewModelProviders.of(this).get(PhoneSelectViewModel::class.java)

        setSupportActionBar(toolbar as Toolbar)
        configureActionBar(supportActionBar)
        title = resources.getString(R.string.select_contact_from_address_book_title)

        requestPermissionContact()
    }

    private fun requestPermissionContact() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_GRANTED) {
            PermisionContactGranted()
        } else {
            //запросить разрешение
            ActivityCompat.requestPermissions(this, arrayOf<String>(Manifest.permission.READ_CONTACTS), REQUEST_PERMISION_CODE)
        }
    }
    private fun PermisionContactGranted() {
        //Разрешение на чтение контактов предоставлено
        //можно читать
        Log.v("Read contacts:","Разрешение на чтение контактов предоставлено пользователем");
        reloadAddressBook()
    }

    private fun reloadAddressBook(){
        val cursor = contentResolver.query(ContactPhone.CONTENT_URI,
                arrayOf(ContactPhone.DISPLAY_NAME, ContactPhone.PHONE_NUMBER, ContactPhone.PHOTO_FULL_URI),
                null, null, null)
        if(cursor == null) {finish();return;}//Нету контактов
        if(cursor.getCount() == 0) {finish();return;}//Нету контактов
        model.reloadAddressBook(cursor)
        cursor.close()

        configureRecycler()
    }

    private fun onItemClick(phone: String?){
        phone?: return
        Log.v("PHONE", "Need add contact {$phone}")
        val intent = Intent()
        intent.putExtra("phone", phone)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    private fun configureRecycler(){
        val adapter = PhoneSelectRecyclerAdapter()
        adapter.setItems(model.contactList)
        adapter.onItemClick = {v -> onItemClick(v)}
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
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

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            REQUEST_PERMISION_CODE -> if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //Разрешение таки получено
                PermisionContactGranted()
            } else finish()
        }
    }


}
