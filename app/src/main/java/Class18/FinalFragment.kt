package com.example.practiceapp.Class18.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practiceapp.R
import com.example.practiceapp.databinding.FragmentFinalBinding

class FinalFragment : Fragment() {

    lateinit var binding: FragmentFinalBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFinalBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        binding.gotohomepage.setOnClickListener {
            findNavController().navigate(R.id.action_finalFragment4_to_homeFragment)
        }
        return binding.root
    }


            }