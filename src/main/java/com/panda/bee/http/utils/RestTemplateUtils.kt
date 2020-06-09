package com.panda.bee.http.utils

import org.springframework.boot.autoconfigure.http.HttpMessageConverters
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestTemplate
import java.net.URI

class RestTemplateUtils private constructor(){

    class SingletonRestTemplate {
        companion object {
            val INSTANCE = RestTemplate()
        }
    }

    class Builder {
        private var mRestTemplate: RestTemplate = SingletonRestTemplate.INSTANCE

        fun addHttpMessageConverter(converter: MappingJackson2HttpMessageConverter): Builder {
            mRestTemplate.messageConverters.add(converter)
            return this
        }

        fun getForObject(url: String, responseType: Class<*>) : Any?{
            return  mRestTemplate.getForObject(url, responseType)
        }
    }




}