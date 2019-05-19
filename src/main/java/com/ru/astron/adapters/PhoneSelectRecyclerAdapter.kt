package com.ru.astron.adapters

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.ru.astron.R
import android.provider.MediaStore
import android.net.Uri
import android.support.v4.content.ContextCompat
import android.view.View
import com.ru.astron.models.ContactPhone
import com.ru.astron.utils.ParsePhoneNumber
import java.io.IOException


class PhoneSelectRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.phone_select_card, viewGroup, false) as ConstraintLayout
        return object : RecyclerView.ViewHolder(v) {}
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val v = viewHolder.itemView as ConstraintLayout
        val photo = v.findViewById<ImageView>(R.id.photo)
        val name = v.findViewById<TextView>(R.id.name)
        val phone = v.findViewById<TextView>(R.id.phone)
        name.text = items[position].name
        var phoneValue = items[position].phone ?: ""
        phoneValue = ParsePhoneNumber.parse(phoneValue)
        phone.text = phoneValue
        try {
            if (items[position].isNoEmptyPhoto)
                photo.setImageBitmap(MediaStore.Images.Media.getBitmap(v.context.contentResolver,
                        Uri.parse(items[position].photo_thumbanall_uri)))
            else
                photo.setImageResource(R.drawable.ic_user)
        } catch (e: IOException) {
            photo.setImageResource(R.drawable.ic_user)
        }
        v.setOnClickListener { onItemClick(items[position].phone) }
    }

    var onItemClick: (String?) -> Unit = { }

    private var items = mutableListOf<ContactPhone>()

    fun setItems(list: List<ContactPhone>) {
        items = list.toMutableList()
        notifyDataSetChanged()
        Log.w("ADAPTER", "setItems list size = ${list.size}")
    }

}