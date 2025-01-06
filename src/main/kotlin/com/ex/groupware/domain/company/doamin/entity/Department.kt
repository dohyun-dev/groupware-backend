package com.ex.groupware.domain.company.doamin.entity

import com.ex.groupware.global.entity.BaseTimeEntity
import jakarta.persistence.*

@Entity
class Department (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false, length = 100)
    var name: String, // 부서

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_dept_id", nullable = true)
    var parentDepartment: Department?,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_map_id", nullable = false)
    val organizationMap: OrganizationMap,
): BaseTimeEntity() {
}