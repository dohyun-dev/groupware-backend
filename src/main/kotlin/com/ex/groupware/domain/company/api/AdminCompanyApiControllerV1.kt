package com.ex.groupware.domain.company.api

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/admin/companies")
interface AdminCompanyApiControllerV1 {

    @PostMapping
    fun register()
}