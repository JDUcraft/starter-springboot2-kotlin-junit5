package com.octo.company

import com.octo.company.company.Company
import com.octo.company.person.Person
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

@DisplayName("Company")
class CompanyTests {

    @Test
    fun `Test a Company `() {
        val company = Company("OCTO", 1)
        assertAll("company",
                Executable { assertEquals("OCTO", company.name) }
        )
    }

    @Nested
    @DisplayName("User - Nested")
    inner class UserTests {
        @Test
        fun `Test a User `() {
            val person = Person("Doe", "John")
            assertAll("person",
                    Executable { assertEquals("John", person.firstName) },
                    Executable { assertEquals("Doe", person.lastName) }
            )
        }
    }
}
