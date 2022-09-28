package com.example.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v1 = findViewById<VideoView>(R.id.videoView)

        v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.lambo)
        val mc = MediaController(this)
        mc.setAnchorView(v1)
        v1.setMediaController(mc)

        Toast.makeText(this,packageName,Toast.LENGTH_LONG).show()
    }
}