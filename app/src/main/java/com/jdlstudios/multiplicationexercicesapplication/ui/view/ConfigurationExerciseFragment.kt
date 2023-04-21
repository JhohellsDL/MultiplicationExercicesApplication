package com.jdlstudios.multiplicationexercicesapplication.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.jdlstudios.multiplicationexercicesapplication.R
import com.jdlstudios.multiplicationexercicesapplication.databinding.FragmentConfigurationExerciseBinding

class ConfigurationExerciseFragment : Fragment() {

    private lateinit var binding: FragmentConfigurationExerciseBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConfigurationExerciseBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController()
        binding.buttonStartExercises.setOnClickListener {
            val action = ConfigurationExerciseFragmentDirections.actionConfigurationExerciseFragmentToEasyLevelFragment()
            navController.navigate(action)
        }

    }

}