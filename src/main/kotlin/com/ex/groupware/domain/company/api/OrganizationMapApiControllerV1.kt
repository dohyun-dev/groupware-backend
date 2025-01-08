package com.ex.groupware.domain.company.api

import com.ex.groupware.domain.company.domain.entity.OrganizationMap
import com.ex.groupware.domain.company.dto.OrganizationMapDto
import com.ex.groupware.domain.company.service.OrganizationMapServiceV1
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/companies/{companyCode}/organization-maps")
class OrganizationMapApiControllerV1(
    val organizationMapService: OrganizationMapServiceV1
) {

    @GetMapping
    fun findHistory(@PathVariable companyCode: String): ResponseEntity<List<OrganizationMap>> {
        return ResponseEntity.ok(
            organizationMapService.findOrganizationMapChangeHistory(companyCode)
        )
    }

    @GetMapping("/{organizationMapId}")
    fun findDetail(@PathVariable organizationMapId: String): ResponseEntity<OrganizationMap> {
        return ResponseEntity.ok(
            organizationMapService.findDetail(organizationMapId)
        )
    }

    @PostMapping
    fun register(@PathVariable companyCode: String, @RequestBody request: OrganizationMapDto): ResponseEntity<Unit> {
        organizationMapService.register(companyCode, request)
        return ResponseEntity.ok().build()
    }

    @PutMapping("/{organizationMapId}")
    fun update(@PathVariable organizationMapId: String, @RequestBody request: OrganizationMapDto): ResponseEntity<Unit> {
        organizationMapService.register(organizationMapId, request)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{organizationMapId}")
    fun delete(@PathVariable organizationMapId: String): ResponseEntity<Unit> {
        organizationMapService.delete(organizationMapId)
        return ResponseEntity.ok().build();
    }
}