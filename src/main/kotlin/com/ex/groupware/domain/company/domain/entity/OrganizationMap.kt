package com.ex.groupware.domain.company.domain.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.*
import java.time.LocalDate

@Entity
class OrganizationMap(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    var company: Company? = null,

    var isReserved: Boolean? = false,

    var effectiveDate: LocalDate? = null,

    var memo: String? = null,

    @OneToMany(mappedBy = "organizationMap", cascade = [CascadeType.ALL], orphanRemoval = true)
    var departments: MutableList<Department> = mutableListOf()
): BaseTimeEntity() {

    @Id
    @Tsid
    val id: String? = null

    fun update(updateParam: OrganizationMap) {
        this.isReserved = updateParam.isReserved
        this.effectiveDate = updateParam.effectiveDate
        this.memo = updateParam.memo
        this.departments = updateParam.departments
    }
}