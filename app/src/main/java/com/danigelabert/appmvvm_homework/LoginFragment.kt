package com.danigelabert.appmvvm_homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.danigelabert.appmvvm_homework.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private val viewModel: LoginViewModel by viewModels()
    private val sharedViewModel: SharedViewModel by viewModels()
    private lateinit var binding: FragmentLoginBinding
    var comprovacio: Boolean = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        binding.logInButton.setOnClickListener {
            val name =binding.userEditText.text.toString()
            val pwd=binding.psdEditText.text.toString()

            if (viewModel.login(name, pwd)) {
                model.login(name, pwd)

                findNavController().navigate(R.id.action_loginFragment_to_viewUserFragment, null)
            }

        }
        return binding.root
    }

}