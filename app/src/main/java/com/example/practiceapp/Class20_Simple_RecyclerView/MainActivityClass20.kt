package com.example.practiceapp.Class20_Simple_RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapp.R
import com.example.practiceapp.databinding.ActivityMainActivityclass18Binding
import com.example.practiceapp.databinding.ActivityMainClass20Binding

class MainActivityClass20 : AppCompatActivity() {
    var nameList = listOf("Adib","Shihab","Safin","Rakibul","Siam","Nasib","Labib","Adib","Shihab","Safin","Rakibul","Siam","Nasib","Labib")
    lateinit var adapter : NameAdapter
    lateinit var binding: ActivityMainClass20Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainClass20Binding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = NameAdapter()
        adapter.submitList(nameList)
        binding.nameRcv.adapter = adapter


    }

}