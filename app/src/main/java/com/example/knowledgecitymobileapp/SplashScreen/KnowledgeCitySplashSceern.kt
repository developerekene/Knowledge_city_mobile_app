package com.example.knowledgecitymobileapp.SplashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.knowledgecitymobileapp.Activities.BooksActivity
import com.example.knowledgecitymobileapp.Activities.MainActivity
import com.example.knowledgecitymobileapp.R

class KnowledgeCitySplashSceern : AppCompatActivity() {
    private val splashTime: Long = 5000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knowledge_city_splash_sceern)

        Handler().postDelayed({
            startActivity(Intent(this, BooksActivity::class.java))
        }, splashTime)
    }
}