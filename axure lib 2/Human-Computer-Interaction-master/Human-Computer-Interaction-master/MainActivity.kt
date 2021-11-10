package com.example.diapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.returnHome
import kotlinx.android.synthetic.main.profile_home.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToAddProfile.setOnClickListener {
            startActivity(Intent(this,ProfileAdd ::class.java ))
        }

        goToMusic.setOnClickListener {
            startActivity(Intent(this,MusicHome ::class.java ))
        }

        goToRead.setOnClickListener {
            startActivity(Intent(this,ReadHome ::class.java ))
        }

        goToHelp.setOnClickListener {
            startActivity(Intent(this,HelpHome ::class.java ))
        }

        goToLike.setOnClickListener {
            startActivity(Intent(this,LikeHome ::class.java ))
        }

        musicPlayTayler.setOnClickListener {
            startActivity(Intent(this,MusicPlayTayler ::class.java ))
        }

    }
}

