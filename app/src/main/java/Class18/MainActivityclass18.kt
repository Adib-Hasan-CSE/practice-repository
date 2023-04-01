package com.example.practiceapp.Class18.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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
        menuInflater.inflate(R.menu.top_menu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.sendMenu ->{
                Toast.makeText(this, "sendMenu Clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.galleryMenu ->{
                Toast.makeText(this, "galleryMenu Clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.callMenu ->{
                Toast.makeText(this, "callMenu Clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.CalculatorMenu ->{
                navController.navigate(R.id.calculatorFragment)

                Toast.makeText(this, "CalculatorMenu Clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.exitMenu ->{
                finish()
                Toast.makeText(this, "exitMenu Clicked", Toast.LENGTH_SHORT).show()
            }

        }
        return super.onOptionsItemSelected(item)
    }

    }
