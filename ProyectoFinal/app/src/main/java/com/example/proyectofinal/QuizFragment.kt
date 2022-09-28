package com.example.proyectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast
import com.example.proyectofinal.databinding.FragmentQuizBinding
import com.example.proyectofinal.models.Quiz


class QuizFragment : Fragment() {

    private lateinit var binding: FragmentQuizBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        binding = FragmentQuizBinding.inflate(inflater,container,false)







        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = ArrayList<Quiz>()

        data.add(Quiz(1,"Cálculo 1","Este examen fue aplicado en el periodo EB-2018-I",R.drawable.calculo,"5to"))
        data.add(Quiz(1,"Álgebra y geometría","Este examen fue aplicado en el periodo EB-2018-I",R.drawable.algebra,"4to"))
        data.add(Quiz(1,"Probabilidad y estadística","Este examen fue aplicado en el periodo EB-2018-I",R.drawable.proba,"6to"))

        data.add(Quiz(1,"Cálculo 1","Este examen fue aplicado en el periodo EB-2018-I",R.drawable.calculo,"5to"))
        data.add(Quiz(1,"Álgebra y geometría","Este examen fue aplicado en el periodo EB-2018-I",R.drawable.algebra,"4to"))
        data.add(Quiz(1,"Probabilidad y estadística","Este examen fue aplicado en el periodo EB-2018-I",R.drawable.proba,"6to"))



        val adapter = QuizAdapter(requireContext(),data)

        binding.lvQuiz.adapter = adapter






    }


}