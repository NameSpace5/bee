package com.panda.bee.http.utils

class URLUtils {
    companion object {
        /**
         * 微信登錄 getSession URL地址，
         */
        fun getWxSessionURL(appId:String, appSecret:String, code: String?): String {
            return "https://api.weixin.qq.com/sns/jscode2session?appid=${appId}&secret=${appSecret}&js_code=${code}&grant_type=authorization_code"
        }
    }
}