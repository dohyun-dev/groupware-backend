package com.ex.groupware.domain.company.service

import com.ex.groupware.domain.company.domain.entity.Company

interface CompanyServiceV1 {
    fun findDetail(companyCode: String): Company
    fun update(companyCode: String, updateParam: Company)
}