package com.vdda.advent

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AdventApplication

fun main(args: Array<String>) {
    SpringApplication.run(AdventApplication::class.java, *args)
}
