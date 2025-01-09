package com.ex.groupware.domain.company.dto

import com.ex.groupware.domain.company.domain.entity.Department
import com.ex.groupware.global.dto.Dto
import java.io.Serializable
import java.time.LocalDateTime

/**
 * DTO for {@link com.ex.groupware.domain.company.domain.entity.Department}
 */
data class DepartmentDto(
    val id: String? = null,
    val name: String,
    val parentId: String? = null,
    val children: MutableList<DepartmentDto> = mutableListOf(),
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null,
) : Serializable, Dto<Department> {
    override fun toEntity(): Department {
        val department = Department(name = name)

        department.children = children.map { childDto ->
            childDto.toEntity().apply {
                this.parent = department
            }
        }.toMutableList()

        return department
    }
}