package com.ex.groupware.domain.company.service.impl

import com.ex.groupware.domain.company.domain.entity.OrganizationMap
import com.ex.groupware.domain.company.domain.repository.CompanyRepository
import com.ex.groupware.domain.company.domain.repository.OrganizationMapRepository
import com.ex.groupware.domain.company.dto.OrganizationMapDto
import com.ex.groupware.domain.company.service.OrganizationMapServiceV1
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class OrganizationMapServiceV1Impl(
    val companyRepository: CompanyRepository,
    val organizationMapRepository: OrganizationMapRepository
): OrganizationMapServiceV1 {

    override fun findOrganizationMapChangeHistory(companyCode: String): List<OrganizationMap> {
        return organizationMapRepository.findByCompanyCode(companyCode)
    }

    override fun findDetail(organizationMapId: String): OrganizationMap {
        return organizationMapRepository.findById(organizationMapId)
            .orElseThrow { RuntimeException("데이터가 존재하지 않습니다.") }
    }

    @Transactional
    override fun register(companyId: String, registerParam: OrganizationMapDto) {
        val company = companyRepository.findById(companyId)
            .orElseThrow { RuntimeException("데이터가 존재하지 않습니다.") }

        val organizationMap = registerParam.toEntity().apply {
            this.company = company
        }

        organizationMapRepository.save(organizationMap)
    }

    @Transactional
    override fun update(organizationMapId: String, updateParam: OrganizationMapDto) {
        val organizationMap = organizationMapRepository.findById(organizationMapId).orElseThrow {
            throw RuntimeException("조직도를 찾을 수 없습니다.")
        }

        organizationMap.update(updateParam.toEntity())
    }

    @Transactional
    override fun delete(organizationMapId: String) {
        val organizationMap = organizationMapRepository.findById(organizationMapId).orElseThrow {
            throw RuntimeException("조직도를 찾을 수 없습니다.")
        }
        organizationMapRepository.delete(organizationMap)
    }
}