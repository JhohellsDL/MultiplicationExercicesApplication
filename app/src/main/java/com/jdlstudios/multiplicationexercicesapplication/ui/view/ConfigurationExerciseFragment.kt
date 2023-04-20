package com.jdlstudios.multiplicationexercicesapplication.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jdlstudios.multiplicationexercicesapplication.R
import com.jdlstudios.multiplicationexercicesapplication.databinding.FragmentConfigurationExerciseBinding

class ConfigurationExerciseFragment : Fragment() {

    private lateinit var binding: FragmentConfigurationExerciseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConfigurationExerciseBinding.inflate(inflater)

        binding.buttonStartExercises.setOnClickListener {
            findNavController().navigate(R.id.action_configurationExerciseFragment_to_easyLevelFragment)
        }

        return binding.root
    }

}