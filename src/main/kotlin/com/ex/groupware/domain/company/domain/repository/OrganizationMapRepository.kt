package com.ex.groupware.domain.company.domain.repository

import com.ex.groupware.domain.company.domain.entity.OrganizationMap
import org.springframework.data.jpa.repository.JpaRepository

interface OrganizationMapRepository : JpaRepository<OrganizationMap, Long> {
}