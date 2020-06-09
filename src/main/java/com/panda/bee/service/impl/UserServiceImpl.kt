package com.panda.bee.service.impl

import com.panda.bee.dao.UserDao
import com.panda.bee.pojo.entity.User
import com.panda.bee.service.UserService
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service
class UserServiceImpl : UserService {
    @Resource
    lateinit var userDao: UserDao

    override fun saveUserInfo(user: User) {
        userDao.insert(user)
    }
}