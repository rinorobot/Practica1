package com.example.proyectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proyectofinal.databinding.FragmentNewsBinding
import com.example.proyectofinal.databinding.FragmentQuizBinding
import com.example.proyectofinal.models.News
import com.example.proyectofinal.models.Quiz


class NewsFragment : Fragment() {

    private lateinit var binding: FragmentNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = ArrayList<News>()

        data.add(News(1,"Se reanudan las clases presenciales","El 9 de enero se dio por iniciado el semestre en su modalidad híbrida",R.drawable.noti1,"10 de enero de 2022"))
        data.add(News(1,"Mañana comienzan las inscripciones","Mañama 11 de enero comienzan las inscripciones a todos nivel.",R.drawable.noti5,"10 de enero de 2022"))
        data.add(News(1,"Planteles avanzan hacia la conectividad","El 9 de enero se dio por iniciado el semestre en su modalidad híbrida",R.drawable.noti6,"10 de enero de 2022"))
        data.add(News(1,"Se reanudan las clases presenciales","El 9 de enero se dio por iniciado el semestre en su modalidad híbrida",R.drawable.noti1,"10 de enero de 2022"))
        data.add(News(1,"Mañana comienzan las inscripciones","Mañama 11 de enero comienzan las inscripciones a todos nivel.",R.drawable.noti2,"10 de enero de 2022"))
        data.add(News(1,"Planteles avanzan hacia la conectividad","El 9 de enero se dio por iniciado el semestre en su modalidad híbrida",R.drawable.nati3,"10 de enero de 2022"))



        val adapter = NewsAdapter(requireContext(),data)
        binding.lvNews.adapter = adapter
    }


}