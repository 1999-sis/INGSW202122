package com.example.diapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.goToMusic
import kotlinx.android.synthetic.main.read_day2.*
import kotlinx.android.synthetic.main.read_day2.btnNext
import kotlinx.android.synthetic.main.read_home.*
import kotlinx.android.synthetic.main.activity_main.returnHome as returnHome1
import kotlinx.android.synthetic.main.read_day2.goToHelp as goToHelp1
import kotlinx.android.synthetic.main.read_day2.goToLike as goToLike1
import kotlinx.android.synthetic.main.read_day2.goToMusic as goToMusic1
import kotlinx.android.synthetic.main.read_home.goToHelp as goToHelp1
import kotlinx.android.synthetic.main.read_home.goToLike as goToLike1
import kotlinx.android.synthetic.main.read_home.returnHome as returnHome1

class ReadDay2: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.read_day2)

        returnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        goToMusic.setOnClickListener {
            startActivity(Intent(this,MusicHome ::class.java ))
        }

        goToLike.setOnClickListener {
            startActivity(Intent(this,LikeHome ::class.java ))
        }

        goToHelp.setOnClickListener {
            startActivity(Intent(this,HelpHome ::class.java ))
        }

        btnNext.setOnClickListener {
            startActivity(Intent(this,ReadDay2 ::class.java ))
        }

        btnBack.setOnClickListener {
            startActivity(Intent(this,ReadHome ::class.java ))
        }

    }
}
