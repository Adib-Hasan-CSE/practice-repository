package com.example.practiceapp.Class17.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapp.R
import com.example.practiceapp.databinding.ActivityMainActivityclass17Binding


class MainActivityclass17 : AppCompatActivity() {
    lateinit var binding: ActivityMainActivityclass17Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainActivityclass17Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}