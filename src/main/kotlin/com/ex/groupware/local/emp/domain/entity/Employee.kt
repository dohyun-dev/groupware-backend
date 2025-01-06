package com.ex.groupware.local.emp.domain.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import jakarta.persistence.*

@Entity
class Employee(
    @Id
    @Column(nullable = false, unique = true, length = 50)
    val empCode: String,

    @Column(nullable = false, length = 100)
    var name: String,

    @Column(nullable = true, length = 15)
    var phoneNumber: String?,

    @Column(unique = true, length = 100)
    var email: String?,
) : BaseTimeEntity() {
}
