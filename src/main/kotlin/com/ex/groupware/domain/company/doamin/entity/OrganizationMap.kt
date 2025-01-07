package com.ex.groupware.domain.company.doamin.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.*
import java.time.LocalDate

@Entity
class OrganizationMap(
    @Id
    @Tsid
    val id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    val company: Company,

    var isReserved: Boolean,

    var effectiveDate: LocalDate,

    var memo: String?,
): BaseTimeEntity() {
}