package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.practiceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Switch.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                Toast.makeText(this, "Switch On", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Switch off", Toast.LENGTH_SHORT).show()
            }
        }

        binding.checkbox.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                Toast.makeText(this, "CheckBox agreed", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "CheckBox disagreed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}