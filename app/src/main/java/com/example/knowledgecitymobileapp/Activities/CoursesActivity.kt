package com.example.knowledgecitymobileapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.knowledgecitymobileapp.R

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        var buttonToArticleActivity = findViewById<Button>(R.id.Courses_Button_id)
        buttonToArticleActivity.setOnClickListener {
            var intent = Intent(this, OnlineAssesmentsActivity::class.java)
            startActivity(intent)
        }
    }
}