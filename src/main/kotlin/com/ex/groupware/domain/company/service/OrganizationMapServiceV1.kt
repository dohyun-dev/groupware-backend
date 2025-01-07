package com.ex.groupware.domain.company.service

import com.ex.groupware.domain.company.doamin.entity.Company
import com.ex.groupware.domain.company.doamin.entity.OrganizationMap

interface OrganizationMapServiceV1 {
    fun findOrganizationMapChangeHistory(companyCode: String)
    fun findDetail(organizationMapId: Long)
    fun register(company: Company, registerParam: OrganizationMap)
    fun update(organizationMapId: Long, registerParam: OrganizationMap)
    fun delete(organizationMapId: Long)
}