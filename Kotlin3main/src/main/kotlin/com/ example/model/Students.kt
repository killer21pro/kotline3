package com.example.model

import jakarta.xml.bind.annotation.*

@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.FIELD)
data class Learners(
    @XmlElement(name = "student")
    val students: List<Learner> = emptyList()
)
