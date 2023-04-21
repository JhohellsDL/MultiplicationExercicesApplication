package com.jdlstudios.multiplicationexercicesapplication.domain.usescases

import com.jdlstudios.multiplicationexercicesapplication.data.model.ExerciseModel
import com.jdlstudios.multiplicationexercicesapplication.data.repository.ExercisesRepository
import com.jdlstudios.multiplicationexercicesapplication.domain.DifficultyLevel
import javax.inject.Inject

class GetExerciseUseCase {

    private val repository: ExercisesRepository = ExercisesRepository()

    operator fun invoke(difficultyLevel: DifficultyLevel): ExerciseModel{
        return repository.getExerciseFromProvider(difficultyLevel)
    }
}