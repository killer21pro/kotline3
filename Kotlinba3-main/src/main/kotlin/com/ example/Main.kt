package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LearnerApp

fun main(args: Array<String>) {
    runApplication<LearnerApp>(*args)
}
