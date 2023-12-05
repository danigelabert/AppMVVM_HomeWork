package com.danigelabert.appmvvm_homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.danigelabert.appmvvm_homework.databinding.FragmentLoginBinding
import com.danigelabert.appmvvm_homework.databinding.FragmentViewUserBinding

class ViewUserFragment : Fragment() {
    private val viewModel: ViewUserViewModel by viewModels()
    private lateinit var binding: FragmentViewUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewUserBinding.inflate(layoutInflater)
        viewModel.nextUser()
        binding.edatTextView.text = viewModel.edat.toString()
        binding.emailTextView.text = viewModel.email
        binding.userTextView.text = viewModel.user
        binding.root.setOnClickListener{
            viewModel.nextUser()
            binding.edatTextView.text = viewModel.edat.toString()
            binding.emailTextView.text = viewModel.email
            binding.userTextView.text = viewModel.user
        }

        return binding.root
    }

}