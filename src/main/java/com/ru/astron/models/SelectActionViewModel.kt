package com.ru.astron.models

import android.arch.lifecycle.ViewModel
import android.database.Cursor
import com.ru.astron.R
import com.ru.astron.entities.ListItem

class SelectActionViewModel : ViewModel(){
    val contacts = mutableListOf<ContactAccount>()
    val recyclerList = mutableListOf<SelectRecyclerItem>()
    val phones = mutableListOf<ContactPhone>()


    fun setContacts(con: List<ListItem>){
        contacts.clear()
        if(con.isEmpty()) return
        for(c in con){
            contacts.add(ContactAccount().apply {
                contact = c
            })
        }
        contacts.last().isLastItem = true
    }

    fun rebuildRecyclerList(){
        recyclerList.clear()
        recyclerList.add(SelectRecyclerMenu())
        if(!contacts.isEmpty()) {
            recyclerList.add(SelectRecyclerSeparator(R.string.contacts_separator_title))
            recyclerList.addAll(contacts)
        }
        if(!phones.isEmpty()){
            recyclerList.add(SelectRecyclerSeparator(R.string.address_book_sepataror_title))
            recyclerList.addAll(phones)
        }
    }

    fun reloadAddressBook(cursor: Cursor){
        phones.clear()
        while (cursor.moveToNext()) {
            val displayName: String? = cursor.getString(cursor.getColumnIndex(ContactPhone.DISPLAY_NAME))
            val phoneNumber: String? = cursor.getString(cursor.getColumnIndex(ContactPhone.PHONE_NUMBER))
            val photoURI: String? = cursor.getString(cursor.getColumnIndex(ContactPhone.PHOTO_FULL_URI))
            displayName?: continue
            phoneNumber?: continue
            val contact = ContactPhone(displayName,phoneNumber,photoURI)
            if(!testPhone(contact)) phones.add(contact)
        }
    }

    fun testPhone(contactPhone: ContactPhone): Boolean {
        for(c in phones) if(c.phone.equals(contactPhone.phone)) return true
        return false
    }

}