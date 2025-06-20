package com.example.model

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Ability(
    @XmlValue
    val name: String = "",
    @XmlAttribute
    val hard: Boolean = false,
    @XmlAttribute
    val soft: Boolean = false
)
