package com.jdlstudios.multiplicationexercicesapplication.domain

enum class DifficultyLevel {
    EASY,
    INTERMEDIATE,
    CHALLENGING,
    ADVANCED;

    companion object {
        private val values = mapOf(
            EASY to "Easy",
            INTERMEDIATE to "Intermediate",
            CHALLENGING to "Challenging",
            ADVANCED to "Advanced"
        )
        fun getDifficulty(difficultyLevel: DifficultyLevel): String {
            return values[difficultyLevel] ?: throw IllegalArgumentException("Invalid difficulty level")
        }

    }
}