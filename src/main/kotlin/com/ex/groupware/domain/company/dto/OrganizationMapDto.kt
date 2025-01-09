package com.ex.groupware.domain.company.dto

import com.ex.groupware.domain.company.domain.entity.OrganizationMap
import com.ex.groupware.global.dto.Dto
import java.io.Serializable
import java.time.LocalDate
import java.time.LocalDateTime

/**
 * DTO for {@link com.ex.groupware.domain.company.domain.entity.OrganizationMap}
 */
data class OrganizationMapDto(
    val id: String? = null,
    val company: CompanyDto? = null,
    val isReserved: Boolean,
    val effectiveDate: LocalDate,
    val memo: String? = null,
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null,
    val departments: List<DepartmentDto> = mutableListOf(),
) : Serializable, Dto<OrganizationMap> {
    override fun toEntity(): OrganizationMap {
        val organizationMap = OrganizationMap(
            isReserved = isReserved,
            effectiveDate = effectiveDate,
            memo = memo,
        )
        val departments = departments.map { it.toEntity().apply { this.organizationMap = organizationMap } }.toMutableList()
        organizationMap.apply {
            this.departments = departments
        }
        return organizationMap
    }
}
