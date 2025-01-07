package com.ex.groupware.domain.company.doamin.repository

import com.ex.groupware.domain.company.doamin.entity.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository : JpaRepository<Company, String> {
}