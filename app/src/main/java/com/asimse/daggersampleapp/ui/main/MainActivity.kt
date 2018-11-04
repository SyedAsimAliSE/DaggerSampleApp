package com.asimse.daggersampleapp.ui.main

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.asimse.daggersampleapp.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavigation()
    }

    private fun setupNavigation() {

        setSupportActionBar(toolbar)

        navController = findNavController(R.id.navHostMain)

        //ToolBar
        NavigationUI.setupActionBarWithNavController(this, navController)

        //BottomNavBar
        NavigationUI.setupWithNavController(bottomNavBar, navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}
