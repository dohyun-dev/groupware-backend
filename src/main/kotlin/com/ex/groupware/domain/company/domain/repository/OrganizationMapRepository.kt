package com.ex.groupware.domain.company.domain.repository

import com.ex.groupware.domain.company.domain.entity.OrganizationMap
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface OrganizationMapRepository : JpaRepository<OrganizationMap, String> {
    @Query("select o from OrganizationMap o where o.company.id = :companyCode")
    fun findByCompanyCode(companyCode: String): List<OrganizationMap>
}