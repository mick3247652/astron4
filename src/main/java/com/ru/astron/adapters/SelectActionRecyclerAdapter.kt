package com.ru.astron.adapters

import android.net.Uri
import android.provider.MediaStore
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.ru.astron.R
import com.ru.astron.entities.ListItem
import com.ru.astron.models.ContactAccount
import com.ru.astron.models.ContactPhone
import com.ru.astron.models.SelectRecyclerItem
import com.ru.astron.models.SelectRecyclerSeparator
import com.ru.astron.ui.util.AvatarWorkerTask
import com.ru.astron.utils.ParsePhoneNumber
import org.w3c.dom.Text
import java.io.IOException

class SelectActionRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items = mutableListOf<SelectRecyclerItem>()


    override fun onCreateViewHolder(viewGroup: ViewGroup, type: Int): RecyclerView.ViewHolder {
        val id = when(type){
            1 -> R.layout.contact_card
            2 -> R.layout.phone_select_card
            3 -> R.layout.menu_card
            else -> R.layout.separator_card
        }

        val v = LayoutInflater.from(viewGroup.getContext()).inflate(
            id,
            viewGroup,
            false
        ) as ConstraintLayout
        return object : RecyclerView.ViewHolder(v) {}
    }

    override fun getItemViewType(position: Int) = items[position].getType()

    override fun getItemCount() = items.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        when(items[position].getType()){
            1 -> {
                val item = items[position] as ContactAccount
                val v = viewHolder.itemView as ConstraintLayout
                val photo = v.findViewById<ImageView>(R.id.photo)
                val name = v.findViewById<TextView>(R.id.name)
                val view = v.findViewById<View>(R.id.view)
                val optionMenu = v.findViewById<TextView>(R.id.textViewOptions)
                name.text = item.contact?.displayName ?: "???"
                AvatarWorkerTask.loadAvatar(item.contact, photo, R.dimen.select_avatar_size)
                if(item.isLastItem) view.visibility = View.GONE
                v.setOnClickListener { onContactClick(item.contact) }
                optionMenu.setOnClickListener { onContactPopUp(item,v)}
            }
            0 -> {
                val item = items[position] as SelectRecyclerSeparator
                val v = viewHolder.itemView as ConstraintLayout
                val name = v.findViewById<TextView>(R.id.name)
                name.text = v.resources.getText(item.text_id)
            }
            2 -> {
                val item = items[position] as ContactPhone
                val v = viewHolder.itemView as ConstraintLayout
                val photo = v.findViewById<ImageView>(R.id.photo)
                val name = v.findViewById<TextView>(R.id.name)
                val phone = v.findViewById<TextView>(R.id.phone)
                name.text = item.name
                var phoneValue = item.phone ?: ""
                phoneValue = ParsePhoneNumber.parse(phoneValue)
                phone.text = phoneValue
                try {
                    if (item.isNoEmptyPhoto)
                        photo.setImageBitmap(
                            MediaStore.Images.Media.getBitmap(v.context.contentResolver,
                                Uri.parse(item.photo_thumbanall_uri)))
                    else
                        photo.setImageResource(R.drawable.ic_user)
                } catch (e: IOException) {
                    photo.setImageResource(R.drawable.ic_user)
                }
                v.setOnClickListener { onAddressBookClick(item.phone) }
            }
            3 -> {
                val v = viewHolder.itemView as ConstraintLayout

                val joinPublicChannel = v.findViewById<ImageButton>(R.id.join_public_channel)
                val joinPublicChannelText = v.findViewById<TextView>(R.id.join_public_channel_text)

                val createPublicChannel = v.findViewById<ImageButton>(R.id.create_public_channel)
                val createPublicChannelText = v.findViewById<TextView>(R.id.create_public_channel_text)

                val createPrivateGroupChat = v.findViewById<ImageButton>(R.id.create_private_group_chat)
                val createPrivateGroupChatText = v.findViewById<TextView>(R.id.create_private_group_chat_text)

                joinPublicChannel.setOnClickListener { onMenuClick(R.id.join_public_channel)}
                joinPublicChannelText.setOnClickListener { onMenuClick(R.id.join_public_channel)}

                createPublicChannel.setOnClickListener { onMenuClick(R.id.create_public_channel)}
                createPublicChannelText.setOnClickListener { onMenuClick(R.id.create_public_channel)}

                createPrivateGroupChat.setOnClickListener { onMenuClick(R.id.create_private_group_chat)}
                createPrivateGroupChatText.setOnClickListener { onMenuClick(R.id.create_private_group_chat)}

            }
        }

    }

    var onContactClick: (ListItem?) -> Unit = { }
    var onAddressBookClick: (String?) -> Unit = { }
    var onMenuClick: (Int) -> Unit = { }
    var onContactPopUp: (ContactAccount, View) -> Unit = {_,_ -> }

    fun setItems(list: List<SelectRecyclerItem>) {
        items = list.toMutableList()
        notifyDataSetChanged()
    }
}