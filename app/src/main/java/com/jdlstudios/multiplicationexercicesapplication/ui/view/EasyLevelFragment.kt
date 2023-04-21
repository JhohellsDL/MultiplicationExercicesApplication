package com.jdlstudios.multiplicationexercicesapplication.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.jdlstudios.multiplicationexercicesapplication.databinding.FragmentEasyLevelBinding
import com.jdlstudios.multiplicationexercicesapplication.ui.viewmodel.EasyLevelViewModel

class EasyLevelFragment : Fragment() {

    private lateinit var binding: FragmentEasyLevelBinding
    private val viewModel: EasyLevelViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEasyLevelBinding.inflate(inflater)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCheck.setOnClickListener {
            viewModel.exercise.observe(viewLifecycleOwner) {
                Toast.makeText(context, "exercise: ${it.firstFactor}", Toast.LENGTH_SHORT).show()
            }
        }
    }

}