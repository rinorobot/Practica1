package com.example.apppelis

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.apppelis.databinding.PeliItemBinding

class PelisAdapter(val pelis: List<Pelis>, val itemClickListener: OnPelisClinkListener): RecyclerView.Adapter<PelisAdapter.ViewHolder>(){

    var index = 0

    interface OnPelisClinkListener{
        fun onItemClick(titulo: String, duracion: String, estreno: String, image: Int, video: String)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.peli_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        index = position
        holder.render(pelis[position])

    }

    override fun getItemCount(): Int {
     return pelis.size
    }


    inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view){


        fun render(pelis: Pelis){


            view.findViewById<TextView>(R.id.tv_titulo).text = pelis.titulo
            view.findViewById<TextView>(R.id.tv_duracion).text = pelis.duracion
            view.findViewById<TextView>(R.id.tv_estreno).text = pelis.estreno
            view.findViewById<ImageView>(R.id.iv_peli).setImageResource(pelis.imagem)

            view.setOnClickListener {
                itemClickListener.onItemClick(pelis.titulo,pelis.duracion,pelis.estreno,pelis.imagem,pelis.video)
            }



        }

    }

}