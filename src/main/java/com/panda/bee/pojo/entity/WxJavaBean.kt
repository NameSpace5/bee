package com.panda.bee.pojo.entity

/**
 * 基础响应bean
 */
data class BaseResponseBean(val status: Int, val data: Any?, val message: String?)

/**
 * 小程序触发getSession后，服务端请求微信后台认证返回的凭证信息
 * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/login/auth.code2Session.html
 */
data class ResponseSessionBean(val openid: String, var session_key: String, val unionId: String?,
                               val errCode: Number?, val errMsg: String?)
