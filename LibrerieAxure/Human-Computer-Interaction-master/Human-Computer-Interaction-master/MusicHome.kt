package com.example.diapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.goToRead
import kotlinx.android.synthetic.main.activity_main.returnHome
import kotlinx.android.synthetic.main.help_home.*
import kotlinx.android.synthetic.main.music_home.*
import kotlinx.android.synthetic.main.help_home.goToHelp as goToHelp1
import kotlinx.android.synthetic.main.help_home.goToLike as goToLike1
import kotlinx.android.synthetic.main.music_home.goToHelp as goToHelp1
import kotlinx.android.synthetic.main.music_home.goToLike as goToLike1
import kotlinx.android.synthetic.main.music_home.goToRead as goToRead1

class MusicHome: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.music_home)

        returnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        goToRead.setOnClickListener {
            startActivity(Intent(this,ReadHome ::class.java ))
        }

        goToHelp.setOnClickListener {
            startActivity(Intent(this,HelpHome ::class.java ))
        }

        musicPlayTaylor.setOnClickListener {
            startActivity(Intent(this,MusicPlayTayler ::class.java ))
        }

        goToLike.setOnClickListener {
            startActivity(Intent(this,LikeHome ::class.java ))
        }

    }
}

