package com.example.knowledgecitymobileapp.fragmentclasses

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.knowledgecitymobileapp.Activities.signupActivity
import com.example.knowledgecitymobileapp.R
import com.example.knowledgecitymobileapp.databinding.HomeFragmantBinding

class HomeFragment(): Fragment(R.layout.home_fragmant) {
    private lateinit var binding: HomeFragmantBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)

//        binding.button.setOnClickListener {
////            val intent = Intent(this, signupActivity::class.java)
////            startActivity(intent)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}