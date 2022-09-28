package com.example.apppelis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import com.example.apppelis.databinding.ActivityPelisDetailsBinding


class PelisDetails : AppCompatActivity() {
    lateinit var binding: ActivityPelisDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPelisDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.extras != null){

            binding.tvTituloDetail.text = intent.getStringExtra("titulo").toString()
            binding.tvDuracionDetaile.text = intent.getStringExtra("duracion").toString()
            binding.tvEstrenoDetaile.text = intent.getStringExtra("estreno").toString()
            binding.ivPelisDetail.setImageResource(intent.getIntExtra("image",0))
           // Toast.makeText(this,intent.getStringExtra("video").toString(),Toast.LENGTH_LONG).show()

            binding.videoDetaile.setVideoPath(intent.getStringExtra("video").toString())
            val mc = MediaController(this)
            mc.setAnchorView(binding.videoDetaile)
            binding.videoDetaile.setMediaController(mc)
            binding.videoDetaile.start()




        }

    }
}