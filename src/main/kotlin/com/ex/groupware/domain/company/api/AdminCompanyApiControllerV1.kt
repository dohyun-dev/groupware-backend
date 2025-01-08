package com.ex.groupware.domain.company.api

import com.ex.groupware.domain.company.dto.CompanyDto
import com.ex.groupware.domain.company.service.AdminServiceV1
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/admin/companies")
class AdminCompanyApiControllerV1(
    val adminServiceV1: AdminServiceV1
) {
    @PostMapping
    fun register(@RequestBody request: CompanyDto) {
        adminServiceV1.registerCompany(request.name)
    }
}