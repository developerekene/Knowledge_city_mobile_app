package com.example.knowledgecitymobileapp.Activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.knowledgecitymobileapp.R
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonToSignUp: Button = findViewById(R.id.button)

        buttonToSignUp.setOnClickListener {
            var intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
//        }


        }

    }
}

