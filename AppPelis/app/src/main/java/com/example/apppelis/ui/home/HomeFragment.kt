package com.example.apppelis.ui.home

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.apppelis.databinding.FragmentHomeBinding
import java.util.regex.Pattern

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val PASSWORD_PATTERN = Pattern.compile("^" +
            "(?=.*[0-9])" +         //at least 1 digit
          //  "(?=.*[a-z])" +         //at least 1 lower case letter
         //   "(?=.*[A-Z])" +         //at least 1 upper case letter
            "(?=.*[a-zA-Z])" +      //any letter
         //   "(?=.*[@#$%^&+=])" +    //at least 1 special character
            "(?=\\S+$)" +           //no white spaces
            ".{6,}" +               //at least 6 characters
            "$")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

      /*  val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/

        binding.btnLogin.setOnClickListener {
            if (validate()){
                Toast.makeText(requireContext(),"Todos los datos fueron ingresados correctamente.",Toast.LENGTH_LONG).show()
            }

        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun validate(): Boolean{
        val email = binding.emailET.text.toString()
        val usuario = binding.userET.text.toString()
        val nip = binding.passET.text.toString()
        if (usuario.isEmpty()){
           binding.userET.setError("Debes llenar este campo")
            return false
        }else if(email.isEmpty()){
            binding.emailET.setError("Debes llenar este campo")
            return false
        }else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.emailET.setError("Ingresa un correo válido")
            return false

        }
        else if(nip.isEmpty()){
            binding.passET.setError("Debes llenar este campo")
            return false
        }else if(!PASSWORD_PATTERN.matcher(nip).matches()){
            binding.passET.setError("La contraseña debe tener 6 caracteres, una letra y un múmero.")
            return false

        }
        else{
            return true
        }
    }
}