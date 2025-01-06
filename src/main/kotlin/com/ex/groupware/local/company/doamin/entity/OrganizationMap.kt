package com.ex.groupware.local.company.doamin.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import jakarta.persistence.*
import java.time.LocalDate

class OrganizationMap(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    val company: Company,

    val isReserved: Boolean,

    val effectiveDate: LocalDate,

    var memo: String?,
): BaseTimeEntity() {
}