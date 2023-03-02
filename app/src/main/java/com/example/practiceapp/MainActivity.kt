package com.example.practiceapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapp.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dc = DecimalFormat("#.##")

        binding.button1.setOnClickListener {
            var weight: Double = binding.input1.text.toString().toDouble()
            var height: Double = binding.input2.text.toString().toDouble()
            val bmi:Double=(weight)/(height*height)
            val roundfig = dc.format(bmi)
            binding.output1.text=when(bmi){
                in 1.00..18.5->{
                    "Your BMI is: $roundfig\n It's Underweight"
                }
                in 18.6..24.9->{
                    "Your BMI is: $roundfig\n It's Normalweight"
                }
                in 25.0..29.9->{
                    "Your BMI is: $roundfig\n It's Overweight"
                }
                else->{
                    "Your BMI is: $roundfig\n It's Obese"
                }
            }
        }
        }
    }





