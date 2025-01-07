package com.ex.groupware.domain.company.doamin.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.*

@Entity
class Company(
    @Id
    @Tsid
    val companyCode: Long?,

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

    constructor(name: String): this(
        null,
        name,
        null,
        null,
        null,
        null
    )

    fun update(updateParam: Company) {
        name = updateParam.name
        representativeNumber = updateParam.representativeNumber
        address = updateParam.address
        businessRegistrationNumber = updateParam.businessRegistrationNumber
        corporateRegistrationNumber = updateParam.corporateRegistrationNumber
    }
}