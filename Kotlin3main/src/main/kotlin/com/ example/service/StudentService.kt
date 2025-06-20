package com.example.service

import com.example.model.Learners
import com.example.repository.LearnerRepository
import jakarta.xml.bind.JAXBContext
import org.springframework.stereotype.Service
import java.io.File

@Service
class LearnerService(private val studentRepository: LearnerRepository) {
    fun processXmlData(xmlFile: String) {
        val context = JAXBContext.newInstance(Learners::class.java)
        val students = context.createUnmarshaller().unmarshal(File(xmlFile)) as Learners
        students.students.forEach { student ->
            val studentId = studentRepository.saveLearner(student)
            student.skills.forEach { skill ->
                studentRepository.saveAbility(studentId, skill)
            }
        }
    }
}
