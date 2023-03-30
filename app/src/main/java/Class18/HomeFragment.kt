package com.example.practiceapp.Class18.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.practiceapp.R
import com.example.practiceapp.databinding.ActivityMainActivityclass18Binding
import com.example.practiceapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        binding.gotoprofile.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)

        }

        binding.gotouser.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_userFragment2)

        }


        return binding.root
    }


}