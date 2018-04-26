package com.octo.company.company

import com.octo.company.company.Company
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class QuotationController {
    @GetMapping("/company/{id}")
    fun getQuotation(@PathVariable(value = "id") id: Int): ResponseEntity<Company> {
        return ResponseEntity.ok(Company("OCTO", id))
    }
}