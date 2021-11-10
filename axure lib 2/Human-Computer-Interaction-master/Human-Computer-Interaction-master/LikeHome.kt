package com.example.diapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.favorite_home.*


class LikeHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.favorite_home)

        returnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
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
        
        readOne.setOnClickListener {
            startActivity(Intent(this,ReadHome ::class.java ))
        }

        readTwo.setOnClickListener {
            startActivity(Intent(this,ReadDay2 ::class.java ))
        }

        musicTaylor.setOnClickListener {
            startActivity(Intent(this,MusicPlayTayler ::class.java ))
        }

    }
}
