package com.ex.groupware.domain.company.api

import com.ex.groupware.domain.company.domain.entity.Company
import com.ex.groupware.domain.company.dto.CompanyDto
import com.ex.groupware.domain.company.service.CompanyServiceV1
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/companies")
class CompanyApiControllerV1(
    val companyService: CompanyServiceV1
) {
    @GetMapping("/{companyCode}")
    fun findInfo(@PathVariable companyCode: String): ResponseEntity<Company> {
        return ResponseEntity.ok(companyService.findDetail(companyCode))
    }

    @PutMapping("/{companyCode}")
    fun update(@PathVariable companyCode: String,  @RequestBody updateParam: CompanyDto) {
        companyService.update(companyCode, updateParam)
    }
}