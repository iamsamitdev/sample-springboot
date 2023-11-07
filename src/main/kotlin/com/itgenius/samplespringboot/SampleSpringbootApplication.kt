package com.itgenius.samplespringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SampleSpringbootApplication

//@RestController
//@RequestMapping("/")
//class ApiController {
//    @GetMapping
//    fun hello(): String {
//        return "Hello World from Spring Boot!"
//    }
//}

fun main(args: Array<String>) {
    runApplication<SampleSpringbootApplication>(*args)
}
