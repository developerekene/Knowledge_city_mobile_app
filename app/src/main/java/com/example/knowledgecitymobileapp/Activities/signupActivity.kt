package com.example.knowledgecitymobileapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import com.example.knowledgecitymobileapp.Functions.Functions
import com.example.knowledgecitymobileapp.R
import com.example.knowledgecitymobileapp.databinding.ActivitySignupBinding

class signupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    lateinit var myFirstName: String
    lateinit var myMiddleName: String
    lateinit var mySurName: String
    lateinit var myEmail: String
    lateinit var myPhoneNumber: String
    lateinit var myPassword: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.logininButtoninSignup.setOnClickListener{
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.signUpMainButton.setOnClickListener {
            registrationForm()
        }
    }

    fun registrationForm(){
        myFirstName = binding.firstNameId.text.toString()
        myMiddleName = binding.middleNameId.text.toString()
        mySurName = binding.surNameId.text.toString()
        myEmail = binding.userEmail.text.toString()
        myPhoneNumber = binding.userPhoneNumber.text.toString()
        myPassword = binding.userPassword.text.toString()

        if(Functions().validateFirstName(myFirstName) &&
            Functions().validateMiddleName(myMiddleName) &&
            Functions().validateSurName(mySurName) &&
            Functions().validateEmail(myEmail) &&
            Functions().validatePhoneNumber(myPhoneNumber) &&
            Functions().validatePassword(myPassword)){
            //add the details to the Firebase database

//            binding.firstNameRequired.text = "First Name Accepted"
        }else{
            if(!Functions().validateFirstName(myFirstName)){
                binding.firstNameRequired.text = "Incorrect First Name"
            }
            if(!Functions().validateMiddleName(myMiddleName)){
                binding.middleNameRequired.text = "Incorrect Middle Name"
            }
            if(!Functions().validateSurName(mySurName)){
                binding.surNameRequired.text = "Incorrect Sur Name"
            }
            if(!Functions().validateEmail(myEmail)){
                binding.userEmailRequired.text = "Incorrect Email"
            }
            if(!Functions().validatePhoneNumber(myPhoneNumber)){
                binding.userPhoneRequired.text = "Incorrect Phone Number"
            }
            if(!Functions().validatePassword(myPassword)){
                binding.userPassRequired.text = "Incorrect Password"

            }
        }
    }

}