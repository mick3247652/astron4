package com.ru.astron.utils

object ParseURL {
    fun getDomain(url: String) = url.substringAfterLast('.')

    fun testDomain(url: String, domain: String): Boolean {
        val d = getDomain(url)
        val res = d.startsWith(domain)
        return res && !url.contains("com.ru.astron")
    }

    fun getChannel(url: String) = url.substringBeforeLast('.').replace("http://","")
}