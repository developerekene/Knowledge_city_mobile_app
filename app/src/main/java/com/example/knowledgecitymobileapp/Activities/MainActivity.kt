package com.example.knowledgecitymobileapp.Activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.knowledgecitymobileapp.R
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)

        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true )
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> Toast.makeText(applicationContext, "clicked on Home", Toast.LENGTH_SHORT).show()
                R.id.menu_message -> Toast.makeText(applicationContext, "clicked on Message", Toast.LENGTH_SHORT).show()
                R.id.menu_sync -> Toast.makeText(applicationContext, "clicked on sync", Toast.LENGTH_SHORT).show()
            }
            true
        }

//        drawerLayout.close()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            drawerLayout.openDrawer(GravityCompat.START);
            true
        }
        false
        return super.onOptionsItemSelected(item)
    }
}