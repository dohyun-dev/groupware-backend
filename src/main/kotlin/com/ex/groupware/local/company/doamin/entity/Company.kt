package com.ex.groupware.local.company.doamin.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import jakarta.persistence.*

@Entity
class Company(
    @Id
    val companyCode: String,

    @Column(nullable = true, unique = true, length = 100)
    var name: String, // 사명

    @Column(nullable = true, length = 15)
    var representativeNumber: String?, // 대표 전화번호

    @Column(nullable = true, length = 200)
    var address: String?, // 주소

    @Column(nullable = true, unique = true, length = 20)
    var businessRegistrationNumber: String?, // 사업자 등록 번호

    @Column(nullable = true, unique = true, length = 20)
    var corporateRegistrationNumber: String?, // 법인 등록 번호
): BaseTimeEntity() {
}