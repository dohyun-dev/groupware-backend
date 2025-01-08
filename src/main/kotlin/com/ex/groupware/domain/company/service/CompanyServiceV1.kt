package com.ex.groupware.domain.company.service

import com.ex.groupware.domain.company.domain.entity.Company
import com.ex.groupware.domain.company.dto.CompanyDto

interface CompanyServiceV1 {
    fun findDetail(companyCode: String): Company
    fun update(companyCode: String, updateParam: CompanyDto)
}