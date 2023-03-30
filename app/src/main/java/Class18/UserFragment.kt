package com.example.practiceapp.Class18.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practiceapp.R
import com.example.practiceapp.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    lateinit var binding: FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        binding.gotofinalpage.setOnClickListener {
            findNavController().navigate(R.id.action_userFragment2_to_finalFragment4)
        }
        return binding.root
    }


}