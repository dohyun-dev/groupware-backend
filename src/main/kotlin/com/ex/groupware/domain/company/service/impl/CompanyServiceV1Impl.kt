package com.ex.groupware.domain.company.service.impl

import com.ex.groupware.domain.company.domain.entity.Company
import com.ex.groupware.domain.company.domain.repository.CompanyRepository
import com.ex.groupware.domain.company.service.CompanyServiceV1
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class CompanyServiceV1Impl(
    val companyRepository: CompanyRepository,
) : CompanyServiceV1 {

    override fun findDetail(companyCode: String): Company {
        return companyRepository.findById(companyCode)
            .orElseThrow { throw RuntimeException("회사 코드가 존재하지 않습니다.")}
    }

    @Transactional
    override fun update(companyCode: String, updateParam: Company) {
        val company = companyRepository.findById(companyCode)
            .orElseThrow { throw RuntimeException("회사 코드가 존재하지 않습니다.") }
        company.update(updateParam)
    }
}