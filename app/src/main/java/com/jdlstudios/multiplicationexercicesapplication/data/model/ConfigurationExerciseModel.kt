package com.jdlstudios.multiplicationexercicesapplication.data.model

import com.jdlstudios.multiplicationexercicesapplication.domain.DifficultyLevel

data class ConfigurationExerciseModel(
    val difficultyLevel: DifficultyLevel,
    val quantity: Int
)