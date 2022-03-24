package com.example.knowledgecitymobileapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.knowledgecitymobileapp.R

class BooksActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityBooksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        var buttonToArticleActivity = findViewById<Button>(R.id.Books_Button_id)
        buttonToArticleActivity.setOnClickListener {
            var intent = Intent(this, ArticleActivity::class.java)
            startActivity(intent)
        }
    }
}
