package com.jdlstudios.multiplicationexercicesapplication.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.jdlstudios.multiplicationexercicesapplication.R
import com.jdlstudios.multiplicationexercicesapplication.databinding.FragmentEasyLevelBinding
import com.jdlstudios.multiplicationexercicesapplication.ui.viewmodel.EasyLevelViewModel

class EasyLevelFragment : Fragment() {

    companion object {
        fun newInstance() = EasyLevelFragment()
    }

    private lateinit var binding: FragmentEasyLevelBinding
    private lateinit var viewModel: EasyLevelViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEasyLevelBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCheck.setOnClickListener {
            Toast.makeText(context, "Si se puede", Toast.LENGTH_SHORT).show()
        }
    }

}