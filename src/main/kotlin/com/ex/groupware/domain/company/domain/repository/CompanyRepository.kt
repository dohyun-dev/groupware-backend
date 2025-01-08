package com.ex.groupware.domain.company.domain.repository

import com.ex.groupware.domain.company.domain.entity.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository : JpaRepository<Company, String> {
}