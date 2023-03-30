package com.example.practiceapp.Class18.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.practiceapp.R
import com.example.practiceapp.databinding.ActivityMainActivityclass18Binding


class MainActivityclass18 : AppCompatActivity() {
    lateinit var binding: ActivityMainActivityclass18Binding
    lateinit var navController: NavController
    lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainActivityclass18Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar.root)
        val drawerLayout = binding.drawerlayout
        val navView = binding.navigationview
        navController = findNavController(R.id.fragmentContainerView)


        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.profileFragment,
                R.id.userFragment2
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, drawerLayout)
        navView.setupWithNavController(navController)

    }


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.drawer_menu, menu)

        return true
    }
    }
