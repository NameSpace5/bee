package com.panda.bee.service

import com.panda.bee.pojo.entity.User

/**
 * @author  panda
 * @date  2020-06-09 13:02
 * @version 1.0
 */
interface UserService {
    fun saveUserInfo(user: User)
}