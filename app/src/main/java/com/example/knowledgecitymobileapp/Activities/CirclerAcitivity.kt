package com.example.knowledgecitymobileapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.knowledgecitymobileapp.Adapters.WelcomePageViewPagerAdapter
import com.example.knowledgecitymobileapp.Data.ViewPagerDataClass
import com.example.knowledgecitymobileapp.R
import me.relex.circleindicator.CircleIndicator3

class CirclerAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circler_acitivity)

        var view_pager_2 = findViewById<ViewPager2>(R.id.view_pager_2)


        view_pager_2.adapter = WelcomePageViewPagerAdapter(ViewPagerDataClass.provideData())
        val indicator: CircleIndicator3 = findViewById(R.id.CircleIndicator3)
        indicator.setViewPager(view_pager_2)

        var buttonToArticleActivity = findViewById<Button>(R.id.view_pager_button)
        buttonToArticleActivity.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


    }
}