package com.example.diapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.returnHome
import kotlinx.android.synthetic.main.profile_home.*

class ProfileAdd: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_home)

        returnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnLogin.setOnClickListener {
            var status = if(etName.text.toString() == "dw"
                && etPassword.text.toString() == "password")
                "Logged In Successfully" else "LogIn Fail"
            Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
        }
        btnLogin.setOnClickListener {
            startActivity(Intent(this, ProfileDisplay::class.java))
        }

    }

}