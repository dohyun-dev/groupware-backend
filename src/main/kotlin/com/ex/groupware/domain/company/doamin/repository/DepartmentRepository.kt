package com.ex.groupware.domain.company.doamin.repository

import com.ex.groupware.domain.company.doamin.entity.Department
import org.springframework.data.jpa.repository.JpaRepository

interface DepartmentRepository : JpaRepository<Department, Long> {
}