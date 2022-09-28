package com.example.apppelis.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apppelis.Pelis
import com.example.apppelis.PelisAdapter
import com.example.apppelis.PelisDetails
import com.example.apppelis.R
import com.example.apppelis.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment(), PelisAdapter.OnPelisClinkListener {

    private var _binding: FragmentGalleryBinding? = null

    val pelis = listOf(Pelis("Pulp Fiction","120min","Acción", R.drawable.pulp,"android.resource://com.example.apppelis/"+R.raw.pulp),Pelis("El padrino","177min","Drama", R.drawable.elpadrino,"android.resource://com.example.apppelis/"+R.raw.padrino),Pelis("El ciudadano Kane","136min","Drama", R.drawable.kane,"android.resource://com.example.apppelis/"+R.raw.kane),Pelis("Pulp Fiction","120min","Acción", R.drawable.pulp,"android.resource://com.example.apppelis/"+R.raw.pulp),Pelis("El padrino","177min","Drama", R.drawable.elpadrino,"android.resource://com.example.apppelis/"+R.raw.padrino),Pelis("El ciudadano Kane","136min","Drama", R.drawable.kane,"android.resource://com.example.apppelis/"+R.raw.kane))

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun initRecyclerView(){
        binding.rvPelis.layoutManager = LinearLayoutManager(requireContext())
        val adapter = PelisAdapter(pelis,this)
        binding.rvPelis.adapter = adapter


    }

    override fun onItemClick(titulo: String, duracion: String, estreno: String, image: Int, video: String) {


        val intent = Intent(requireContext(),PelisDetails::class.java)
        intent.putExtra("titulo",titulo)
        intent.putExtra("duracion",duracion)
        intent.putExtra("estreno",estreno)
        intent.putExtra("image",image)
        intent.putExtra("video",video)
        startActivity(intent)
    }
}