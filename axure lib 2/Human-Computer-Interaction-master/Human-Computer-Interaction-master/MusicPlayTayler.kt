package com.example.diapp

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.View
import android.widget.ProgressBar
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.music_play_tayler.*

class MusicPlayTayler: AppCompatActivity() {
    private lateinit var mp:MediaPlayer
    private var totalTime: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.music_play_tayler)

        mp = MediaPlayer.create(this,R.raw.taylor)
        mp.isLooping = true
        totalTime = mp.duration

        positionBar.max = totalTime
        positionBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean) {
                    if (fromUser) {
                        mp.seekTo(progress)
                    }
                }
                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                }
                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                }
            }
        )
        Thread(Runnable {
            while (mp != null){
                try{
                    var msg = Message()
                    msg.what = mp.currentPosition
                    handler.sendMessage(msg)
                    Thread.sleep(1000)
                } catch (e:InterruptedException){
                }
            }
        }).start()
        
        btnBack.setOnClickListener {
            startActivity(Intent(this,MusicHome ::class.java ))
        }
    }

    @SuppressLint("HandlerLeak")
    var handler = object : Handler(){
        override fun handleMessage(msg: Message) {
            var currentPosition = msg.what
            positionBar.progress = currentPosition
            var elapsedTime = createTimeLabel(currentPosition)
            elapsedTimeLabel.text = elapsedTime

            var remainingTime = createTimeLabel(totalTime - currentPosition)
            remainingTimeLabel.text = "-$remainingTime"
        }
    }

    fun createTimeLabel(time: Int):String{
        var timeLabel = ""
        var min = time / 1000 / 60
        var sec = time / 1000 % 60
        timeLabel = "$min: "
        if (sec<10) timeLabel += "0"
        timeLabel += sec
        return timeLabel
    }

    fun playBtnClick(v:View){
        if(mp.isPlaying) {
            mp.pause()
            playBtn.setBackgroundResource(R.drawable.play)
        } else {
            mp.start()
            playBtn.setBackgroundResource(R.drawable.pause)
        }
    }

}
