package com.jdlstudios.multiplicationexercicesapplication.ui.viewmodel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jdlstudios.multiplicationexercicesapplication.data.model.ExerciseModel
import com.jdlstudios.multiplicationexercicesapplication.domain.DifficultyLevel
import com.jdlstudios.multiplicationexercicesapplication.domain.usescases.GetExerciseUseCase

class EasyLevelViewModel : ViewModel() {

    private val useCase: GetExerciseUseCase = GetExerciseUseCase()

    private val _exercise = MutableLiveData<ExerciseModel>()
    val exercise : LiveData<ExerciseModel>
        get() = _exercise

    private var e : ExerciseModel = ExerciseModel(
        2,3,6
    )

    init {
        _exercise.value = e
        setExercise()
    }

    private fun getExercise() {
        e = useCase(difficultyLevel = DifficultyLevel.EASY)
    }

    private fun setExercise() {
        _exercise.value = useCase(difficultyLevel = DifficultyLevel.EASY)
    }
}