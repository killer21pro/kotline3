package com.example.model

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Learner(
    @XmlElement(name = "first_name")
    val firstName: String = "",
    @XmlElement(name = "second_name")
    val secondName: String = "",
    @XmlElementWrapper(name = "skills")
    @XmlElement(name = "skill")
    val skills: List<Ability> = emptyList()
)
