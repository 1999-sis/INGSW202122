package com.example.diapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.help_home.*
import kotlinx.android.synthetic.main.help_home.goToRead
import kotlinx.android.synthetic.main.help_home.returnHome
import kotlinx.android.synthetic.main.activity_main.goToLike as goToLike1
import kotlinx.android.synthetic.main.activity_main.goToMusic as goToMusic1

class HelpHome: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help_home)

        returnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        goToRead.setOnClickListener {
            startActivity(Intent(this,ReadHome ::class.java ))
        }

        goToMusic.setOnClickListener {
            startActivity(Intent(this,MusicHome ::class.java ))
        }

        goToLike.setOnClickListener {
            startActivity(Intent(this,LikeHome ::class.java ))
        }

        SFSU.setOnClickListener {
            startActivity(Intent(this,HelpDetailSFSU ::class.java ))
        }

    }
}