package com.example.controller

import com.example.service.LearnerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class LearnerCtrl(private val studentService: LearnerService) {
    @GetMapping("/import")
    fun importLearners(@RequestParam file: String = "src/main/resources/students.xml"): String {
        studentService.processXmlData(file)
        return "Импорт завершён!"
    }
}
