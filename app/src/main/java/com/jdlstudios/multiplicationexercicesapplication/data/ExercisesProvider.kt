package com.jdlstudios.multiplicationexercicesapplication.data

import com.jdlstudios.multiplicationexercicesapplication.data.model.ExerciseModel
import com.jdlstudios.multiplicationexercicesapplication.domain.DifficultyLevel

class ExercisesProvider {

    companion object {

        private val difficultyLevels = mapOf(
            DifficultyLevel.EASY to Pair(0..9, 0..9),
            DifficultyLevel.INTERMEDIATE to Pair(10..99, 1..9),
            DifficultyLevel.CHALLENGING to Pair(100..999, 10..99),
            DifficultyLevel.ADVANCED to Pair(100..999, 100..999)
        )

        fun randomMultiplication(level: DifficultyLevel): ExerciseModel {
            val (factorRange1, factorRange2) = difficultyLevels[level]
                ?: throw IllegalArgumentException("Invalid difficulty level")
            val f1 = factorRange1.random()
            val f2 = factorRange2.random()
            val r = f1 * f2

            return ExerciseModel(
                firstFactor = f1,
                secondFactor = f2,
                productResult = r
            )
        }
    }

}