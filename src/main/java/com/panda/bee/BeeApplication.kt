package com.panda.bee

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
@MapperScan("com.panda.bee")
@SpringBootApplication
class BeeApplication

fun main(args: Array<String>) {
    runApplication<BeeApplication>(*args)
}
