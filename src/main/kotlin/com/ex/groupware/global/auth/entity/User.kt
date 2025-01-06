package com.ex.groupware.global.auth.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(unique = true, length = 100)
    val username: String,

    @Column(unique = false, length = 100)
    var password: String,
) : BaseTimeEntity() {;
    constructor(username: String, password: String) : this(null, username, password) {}
}