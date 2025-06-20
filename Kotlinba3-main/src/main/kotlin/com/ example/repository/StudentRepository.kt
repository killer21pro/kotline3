package com.example.repository

import com.example.model.Learner
import com.example.model.Ability
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class LearnerRepository(private val jdbcTemplate: JdbcTemplate) {
    fun saveLearner(student: Learner): Long {
        val keyHolder = org.springframework.jdbc.support.GeneratedKeyHolder()
        jdbcTemplate.update({ connection ->
            val ps = connection.prepareStatement(
                "INSERT INTO students(first_name, last_name) VALUES (?, ?)",
                arrayOf("id")
            )
            ps.setString(1, student.firstName)
            ps.setString(2, student.secondName)
            ps
        }, keyHolder)
        return keyHolder.key!!.toLong()
    }

    fun saveAbility(studentId: Long, skill: Ability) {
        jdbcTemplate.update(
            "INSERT INTO skills(student_id, name, hard, soft) VALUES (?, ?, ?, ?)",
            studentId, skill.name, skill.hard, skill.soft
        )
    }
}
