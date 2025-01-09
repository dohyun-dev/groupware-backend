package com.ex.groupware.domain.company.domain.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.*

@Entity
class Company(
    @Column(nullable = true, unique = true, length = 100)
    var name: String,

    @Column(nullable = true, length = 15)
    var representativeContact: String? = null,

    @Column(nullable = true, length = 200)
    var address: String? = null,

    @Column(nullable = true, unique = true, length = 20)
    var businessRegistrationNumber: String? = null,

    @Column(nullable = true, unique = true, length = 20)
    var corporateRegistrationNumber: String? = null,
): BaseTimeEntity() {

    @Id
    @Tsid
    val id: String? = null;

    constructor(name: String): this(
        name,
        null,
        null,
        null,
        null
    )

    fun update(updateParam: Company) {
        name = updateParam.name
        representativeContact = updateParam.representativeContact
        address = updateParam.address
        businessRegistrationNumber = updateParam.businessRegistrationNumber
        corporateRegistrationNumber = updateParam.corporateRegistrationNumber
    }
}