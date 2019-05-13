package com.ru.astron.utils

object ParseURL {
    fun getDomain(url: String) = url.substringAfterLast('.')
    fun testDomain(url: String, domain: String) = getDomain(url) == domain
    fun getChannel(url: String) = url.substringBeforeLast('.').replace("http://","")
}