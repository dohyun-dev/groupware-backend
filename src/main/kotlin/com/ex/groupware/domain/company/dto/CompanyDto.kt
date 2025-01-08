package com.ex.groupware.domain.company.dto

import com.ex.groupware.domain.company.domain.entity.Company
import com.ex.groupware.global.dto.Dto
import java.io.Serializable
import java.time.LocalDateTime

/**
 * DTO for {@link com.ex.groupware.domain.company.domain.entity.Company}
 */
data class CompanyDto(
    val id: String? = null,
    val name: String,
    val representativeContact: String? = null,
    val address: String? = null,
    val businessRegistrationNumber: String? = null,
    val corporateRegistrationNumber: String? = null,
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null
) : Serializable, Dto<Company> {
    override fun toEntity(): Company {
        return Company(
            name = name,
            representativeContact = representativeContact,
            address = address,
            businessRegistrationNumber = businessRegistrationNumber,
            corporateRegistrationNumber = corporateRegistrationNumber,
        )
    }
}