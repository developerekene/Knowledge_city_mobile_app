package com.example.knowledgecitymobileapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.knowledgecitymobileapp.R

class ArticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        var buttonToArticleActivity = findViewById<Button>(R.id.Article_Button_id)
        buttonToArticleActivity.setOnClickListener {
            var intent = Intent(this, CoursesActivity::class.java)
            startActivity(intent)
        }
    }
}