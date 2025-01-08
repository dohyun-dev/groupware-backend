package com.ex.groupware.domain.company.service.impl

import com.ex.groupware.domain.company.domain.entity.Company
import com.ex.groupware.domain.company.domain.repository.CompanyRepository
import com.ex.groupware.domain.company.service.AdminServiceV1
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class AdminServiceV1Impl(
    val companyRepository: CompanyRepository,
): AdminServiceV1 {

    override fun registerCompany(companyName: String) {
        val newCompany = Company(companyName)
        companyRepository.saveAndFlush(newCompany)
    }
}