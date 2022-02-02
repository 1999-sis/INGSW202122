package com.example.diapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.returnHome
import kotlinx.android.synthetic.main.profile_display.*

class ProfileDisplay: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_display)

        returnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnLogout.setOnClickListener {
            startActivity(Intent(this, ProfileAdd::class.java))
        }
    }
}



