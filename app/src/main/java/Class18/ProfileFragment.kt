package com.example.practiceapp.Class18.Fragments

import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practiceapp.R
import com.example.practiceapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        binding.gotofinalpage1.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_finalFragment4)
        }
        return binding.root
    }
    }
