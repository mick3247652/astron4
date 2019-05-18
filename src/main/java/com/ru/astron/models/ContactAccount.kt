package com.ru.astron.models

import com.ru.astron.entities.ListItem

class ContactAccount : SelectRecyclerItem {
    override fun getType(): Int = 1
    var contact: ListItem? = null
    var isLastItem = false
}