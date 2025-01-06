package com.ex.groupware.domain.company.api

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/companies/{companyCode}/organization-maps")
interface OrganizationMapApiControllerV1 {

    @GetMapping
    fun findHistory()

    @GetMapping("/{organizationMapId}")
    fun findDetail(@PathVariable organizationMapId: Long)

    @PostMapping
    fun register(@PathVariable companyCode: String)

    @PutMapping("/{organizationMapId}")
    fun update(@PathVariable organizationMapId: Long)

    @DeleteMapping("/{organizationMapId}")
    fun delete(@PathVariable organizationMapId: Long)
}