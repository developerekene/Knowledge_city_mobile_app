package com.example.knowledgecitymobileapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.knowledgecitymobileapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var signInButton: Button = findViewById(R.id.sign_in_btn)

        signInButton.setOnClickListener {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
        }
    }
}