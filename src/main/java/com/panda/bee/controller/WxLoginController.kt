package com.panda.bee.controller

import com.alibaba.druid.support.json.JSONParser
import com.alibaba.druid.support.json.JSONUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.util.JSONPObject
import com.fasterxml.jackson.databind.util.JSONWrappedObject
import com.panda.bee.http.converter.WxGetSessionConverter
import com.panda.bee.http.utils.RestTemplateUtils
import com.panda.bee.http.utils.URLUtils
import com.panda.bee.pojo.entity.BaseResponseBean
import com.panda.bee.pojo.entity.ResponseSessionBean
import com.panda.bee.pojo.entity.User
import com.panda.bee.service.UserService
import com.panda.bee.service.impl.UserServiceImpl
import com.panda.bee.staticConst.AppConfig
import com.panda.bee.staticConst.Constant
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.configurationprocessor.json.JSONObject
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource
import javax.servlet.http.HttpServletRequest

@RestController
class WxLoginController {

    @Autowired
    lateinit var config: AppConfig

    @Autowired
    lateinit var request: HttpServletRequest

    @Resource
    lateinit var userService: UserService

    @RequestMapping("/api/dh/getSession", method = [RequestMethod.GET])
    fun getWxSession(code: String?): BaseResponseBean? {
        println(request.getHeader("clientInfo"))
        val sessionBean = RestTemplateUtils.Builder()
                .addHttpMessageConverter(WxGetSessionConverter())
                .getForObject(
                        URLUtils.getWxSessionURL(config.wxAppId, config.wxAppSecret, code),
                        ResponseSessionBean::class.java
                )
        if(sessionBean != null) {
            //session_key 只在后台进行相应处理，自定义登录状态，不必传递到前台
            (sessionBean as ResponseSessionBean).session_key = ""
            return BaseResponseBean(0, sessionBean, Constant.SUCCESS)
        }
        return BaseResponseBean(-1,null, Constant.FAIL + ": getSession")
    }

    @GetMapping("api/dh/login")
    fun saveUserInfo(user: String?): BaseResponseBean {
        println("111$user")
        val userInfo = JSONUtils.parse(user)
        val objectMapper = ObjectMapper()
        val res: User = objectMapper.readValue(user, User::class.java)
        userService.saveUserInfo(user = res)


        if (null == userInfo) {
            return BaseResponseBean(-1, "", "用户信息不能为null")
        } else {
            return BaseResponseBean(200, "", "登陆成功")
        }
    }
}