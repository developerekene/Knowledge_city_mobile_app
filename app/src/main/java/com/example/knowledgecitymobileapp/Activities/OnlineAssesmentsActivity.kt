package com.example.knowledgecitymobileapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.knowledgecitymobileapp.R

class OnlineAssesmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_assesments)

        var buttonToArticleActivity = findViewById<Button>(R.id.Online_Assesments_Button_id)
        buttonToArticleActivity.setOnClickListener {
            var intent = Intent(this, PracticeActivity::class.java)
            startActivity(intent)
        }
    }
}