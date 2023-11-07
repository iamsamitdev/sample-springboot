package com.itgenius.samplespringboot.controllers

import com.itgenius.samplespringboot.models.Sampledata
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/sample")
class SampleController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World from Spring Boot!"
    }

    @GetMapping
    fun getSample(): List<Sampledata> {
        return listOf(
            Sampledata(1, "John Doe", "john@email.com",
                "0812345678", "Bangkok 10110"),
            Sampledata(2, "Jane Doe", "jane@email.com",
                "0875545895", "123/456"),
            Sampledata(3, "Sam Smith", "sam@email.com",
                "0891234567", "456/789")
        )
    }

    @GetMapping("/{id}")
    fun getSampleById(@PathVariable id: Int): Sampledata {
        return Sampledata(
            id, "John Doe", "john@email.com",
            "0812345678", "Bangkok 10110"
        )
    }

    @PostMapping
    fun createSample(@RequestBody sampledata: Sampledata): Sampledata {
        return sampledata
    }

    @PutMapping("/{id}")
    fun updateSample(@PathVariable id: Int, @RequestBody sampledata: Sampledata): Sampledata {
        return sampledata.copy(id = id)
    }

    @DeleteMapping("/{id}")
    fun deleteSample(@PathVariable id: Int): String {
        return "Sample ID $id has been deleted"
    }

}