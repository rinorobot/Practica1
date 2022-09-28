package com.example.proyectofinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.proyectofinal.databinding.NewsElementBinding
import com.example.proyectofinal.models.News
import com.example.proyectofinal.models.Quiz

class NewsAdapter(private val context: Context, val data: ArrayList<News>): BaseAdapter() {
    private val layoutInflater = LayoutInflater.from(context)
    override fun getCount(): Int {
        return data.size    }

    override fun getItem(p0: Int): Any {
        return data[p0]    }

    override fun getItemId(position: Int): Long {
        return data[position].id.toLong()    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val binding = NewsElementBinding.inflate(layoutInflater)
        binding.titleNews.text = data[p0].title
        binding.descNews.text = data[p0].descrption
        binding.dateNews.text = data[p0].date
        binding.ivNews.setImageResource(data[p0].img)
        return binding.root
    }
}