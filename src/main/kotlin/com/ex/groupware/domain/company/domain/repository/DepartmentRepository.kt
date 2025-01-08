package com.ex.groupware.domain.company.domain.repository

import com.ex.groupware.domain.company.domain.entity.Department
import org.springframework.data.jpa.repository.JpaRepository

interface DepartmentRepository : JpaRepository<Department, Long> {
}