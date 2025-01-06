package com.ex.groupware.domain.company.api

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/companies")
interface CompanyApiControllerV1 {
    @GetMapping("/{companyCode}")
    fun findInfo(@PathVariable companyCode: String)

    @PutMapping("/{companyCode}")
    fun update(@PathVariable companyCode: String)
}