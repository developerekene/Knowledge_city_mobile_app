package com.example.knowledgecitymobileapp.Activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.knowledgecitymobileapp.R
import com.example.knowledgecitymobileapp.fragmentclasses.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val searchFragment = SearchFragment()
        val profileFragment = ProfileFragment()
        val settingFragment = SettingFragment()
        val toolsFragment = ToolsFragment()

        //setting current fragment to display
        setCurrentFragment(homeFragment)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> setCurrentFragment(homeFragment)
                R.id.menu_search -> setCurrentFragment(searchFragment)
                R.id.menu_profile -> setCurrentFragment(profileFragment)
                R.id.menu_settings -> setCurrentFragment(settingFragment)
                R.id.menu_tools -> setCurrentFragment(toolsFragment)
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.fragment_holder, fragment)
        commit()
    }
}

