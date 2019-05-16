package com.ru.astron.utils

object TestMessage {
    val IMAGE_DATA_HEADER = "image_data_for_view:"
    fun testImageData(data: String) = data.startsWith(IMAGE_DATA_HEADER)
    fun removeImageDataHeader(data: String) = data.replace(IMAGE_DATA_HEADER,"")
}