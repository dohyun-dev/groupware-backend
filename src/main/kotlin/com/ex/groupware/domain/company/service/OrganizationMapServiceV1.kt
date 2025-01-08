package com.ex.groupware.domain.company.service

import com.ex.groupware.domain.company.domain.entity.OrganizationMap
import com.ex.groupware.domain.company.dto.OrganizationMapDto

interface OrganizationMapServiceV1 {
    fun findOrganizationMapChangeHistory(companyCode: String): List<OrganizationMap>
    fun findDetail(organizationMapId: String): OrganizationMap
    fun register(companyId: String, registerParam: OrganizationMapDto)
    fun update(organizationMapId: String, updateParam: OrganizationMapDto)
    fun delete(organizationMapId: String)
}