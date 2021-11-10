package com.example.diapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.returnHome
import kotlinx.android.synthetic.main.read_home.*
import kotlinx.android.synthetic.main.activity_main.goToLike as goToLike1
import kotlinx.android.synthetic.main.activity_main.goToMusic as goToMusic1
import kotlinx.android.synthetic.main.read_home.goToHelp as goToHelp1

class ReadHome: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.read_home)

        returnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        goToMusic.setOnClickListener {
            startActivity(Intent(this,MusicHome ::class.java ))
        }

        goToHelp.setOnClickListener {
            startActivity(Intent(this,HelpHome ::class.java ))
        }

        goToLike.setOnClickListener {
            startActivity(Intent(this,LikeHome ::class.java ))
        }

        btnNext.setOnClickListener {
            startActivity(Intent(this,ReadDay2 ::class.java ))
        }

    }
}
