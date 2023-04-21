package com.jdlstudios.multiplicationexercicesapplication.data.repository

import com.jdlstudios.multiplicationexercicesapplication.data.ExercisesProvider
import com.jdlstudios.multiplicationexercicesapplication.data.model.ExerciseModel
import com.jdlstudios.multiplicationexercicesapplication.domain.DifficultyLevel
import javax.inject.Inject

class ExercisesRepository {

    fun getExerciseFromProvider(difficultyLevel: DifficultyLevel): ExerciseModel {
        return ExercisesProvider.randomMultiplication(difficultyLevel)
    }

}