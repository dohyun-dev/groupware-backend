package com.ex.groupware.domain.company.doamin.repository

import com.ex.groupware.domain.company.doamin.entity.OrganizationMap
import org.springframework.data.jpa.repository.JpaRepository

interface OrganizationMapRepository : JpaRepository<OrganizationMap, Long> {
}