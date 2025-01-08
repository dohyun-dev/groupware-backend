package com.ex.groupware.domain.company.domain.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.*

@Entity
class Department (
    @Column(nullable = false, length = 100)
    var name: String, // 부서

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_dept_id", nullable = true)
    var parent: Department? = null,

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    var children: MutableList<Department> = mutableListOf(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_map_id", nullable = false)
    var organizationMap: OrganizationMap? = null,
): BaseTimeEntity() {
    @Id
    @Tsid
    val id: String? = null
}