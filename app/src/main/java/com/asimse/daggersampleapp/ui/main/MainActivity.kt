package com.asimse.daggersampleapp.ui.main

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.asimse.daggersampleapp.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : DaggerAppCompatActivity() {

    lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavigation()
    }

    private fun setupNavigation(){

        setSupportActionBar(toolbar)

        navController = findNavController(R.id.navHostMain)

        //ActionBar
        NavigationUI.setupActionBarWithNavController(this, navController)

        //BottomNavBar
        NavigationUI.setupWithNavController(bottomNavBar, navController)

    }

    override fun onNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}
