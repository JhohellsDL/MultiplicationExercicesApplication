package com.jdlstudios.multiplicationexercicesapplication.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jdlstudios.multiplicationexercicesapplication.R
import com.jdlstudios.multiplicationexercicesapplication.databinding.FragmentIntermediateLevelBinding
import com.jdlstudios.multiplicationexercicesapplication.ui.viewmodel.ChallengingLevelViewModel

class ChallengingLevelFragment : Fragment() {

    private lateinit var binding: FragmentIntermediateLevelBinding
    private lateinit var viewModel: ChallengingLevelViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIntermediateLevelBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}