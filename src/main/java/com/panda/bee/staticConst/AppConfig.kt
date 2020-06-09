package com.panda.bee.staticConst

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "app-config")
class AppConfig {
    lateinit var wxAppId: String
    lateinit var wxAppSecret:String
}