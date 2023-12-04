package com.danigelabert.appmvvm_homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.danigelabert.appmvvm_homework.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private val viewModel: LoginViewModel by viewModels()
    private lateinit var binding: FragmentLoginBinding
    var comprovacio: Boolean = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        binding.logInButton.setOnClickListener {
            viewModel.comprovacioLogIn(binding.userEditText.text.toString(), binding.psdEditText.text.toString())
            if (comprovacio==true){
                Toast.makeText(this.context, "Notificación corta", Toast.LENGTH_LONG).show();
            }
        }
        return binding.root
    }

}