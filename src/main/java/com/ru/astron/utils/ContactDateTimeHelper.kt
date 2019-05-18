package com.ru.astron.utils

import android.content.Context
import com.ru.astron.R
import com.ru.astron.entities.Contact
import org.joda.time.DateTime
import java.util.*

object ContactDateTimeHelper {
    private var current = DateTime()

    fun updateCurrentDateTime(){
        current = DateTime()
    }

    fun contactLastSeen(context: Context, contact: Contact): String {
        val lastseen = contact.lastseen
        if(lastseen == 0L) return ""
        val datetime = getDateTimeFromTimestamp(lastseen)

        val contactDay = datetime.dayOfMonth

        val currentDay = current.dayOfMonth

        val contactTimestamp = datetime.millis / 1000L
        val currentTimestamp = current.millis / 1000L

        val diffSeconds = currentTimestamp - contactTimestamp

        if(diffSeconds < 0) {
            updateCurrentDateTime()
            return contactLastSeen(context, contact)
        }

        if(diffSeconds < 65L) return context.resources.getString(R.string.contact_online_title) //меньше минуту значит онлайн

        if(diffSeconds < 3600L) return formatMinutes(context, diffSeconds / 60L) //меньше часа значит %d минут назад

        if(diffSeconds < 3600L * 48L && currentDay == contactDay) formatFullNow(context, datetime) //дни совпадают но месяца не прошло, значит сегодня

        if(diffSeconds < 3600L * 48L && currentDay == contactDay + 1) formatYesterday(context, datetime) //вчера

        return formatFullDays(context, datetime)
    }

    private fun formatTime(datetime: DateTime): String {
        return "${datetime.hourOfDay}:${datetime.minuteOfHour}"
    }

    private fun formatDate(datetime: DateTime): String {
        return "${datetime.dayOfMonth}/${datetime.monthOfYear}/${datetime.year}"
    }

    private fun formatFullDays(context: Context, datetime: DateTime): String {
        val title = context.resources.getString(R.string.lastseen_title)
        return "${title} ${formatDate(datetime)} ${formatTime(datetime)}"
    }

    private fun formatYesterday(context: Context, datetime: DateTime): String {
        val title = context.resources.getString(R.string.yesterday_title)
        return "${title} ${formatTime(datetime)}"
    }

    private fun formatFullNow(context: Context, datetime: DateTime): String {
        val title = context.resources.getString(R.string.today_title)
        return "${title} ${formatTime(datetime)}"
    }

    private fun formatMinutes(context: Context, minutes: Long): String {
        val title = context.resources.getString(R.string.lastseen_title)
        val end_title = context.resources.getString(R.string.minutes_ago_title)
        return "${title} ${minutes} ${end_title}"
    }

    private fun getDateTimeFromTimestamp(v: Long): DateTime {
        var value = v
        val timeZone = TimeZone.getDefault()
        val offset = timeZone.getOffset(value)
        if (offset < 0) {
            value -= offset
        } else {
            value += offset
        }
        return DateTime(value)
    }
}