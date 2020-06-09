package com.panda.bee.http.converter

import org.springframework.http.MediaType
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter

class WxGetSessionConverter : MappingJackson2HttpMessageConverter() {
    init {
        val mediaTypes = arrayListOf<MediaType>()
        mediaTypes.add(MediaType.TEXT_PLAIN)
        mediaTypes.add(MediaType.TEXT_HTML)
        supportedMediaTypes = mediaTypes
    }
}