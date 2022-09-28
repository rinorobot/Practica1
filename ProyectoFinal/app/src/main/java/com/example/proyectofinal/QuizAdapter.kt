package com.example.proyectofinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.proyectofinal.databinding.QuizElementBinding
import com.example.proyectofinal.models.Quiz

class QuizAdapter(private val context: Context, val data: ArrayList<Quiz>): BaseAdapter() {
    private val layoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {

        return data.size
    }

    override fun getItem(p0: Int): Any {
        return data[p0]
    }

    override fun getItemId(position: Int): Long {
        return data[position].id.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val binding = QuizElementBinding.inflate(layoutInflater)

        binding.titleQuiz.text = data[position].title
        binding.descQuiz.text = data[position].descrption
        binding.semQuiz.text = data[position].sem
        binding.ivQuiz.setImageResource(data[position].img)

        return binding.root
    }
}