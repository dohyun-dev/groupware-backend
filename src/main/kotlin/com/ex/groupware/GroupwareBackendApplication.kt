package com.ex.groupware

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GroupwareBackendApplication

fun main(args: Array<String>) {
    runApplication<GroupwareBackendApplication>(*args)
}
