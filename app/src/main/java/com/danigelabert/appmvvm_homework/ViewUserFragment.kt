package com.danigelabert.appmvvm_homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.danigelabert.appmvvm_homework.databinding.FragmentLoginBinding
import com.danigelabert.appmvvm_homework.databinding.FragmentViewUserBinding

class ViewUserFragment : Fragment() {
    private val sharedViewModel: SharedViewModel by viewModels()
    private lateinit var binding: FragmentViewUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewUserBinding.inflate(layoutInflater)

        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        model._user.observe(viewLifecycleOwner, Observer {
            binding.userTextView.text = it.name
            binding.edatTextView.text = it.pwd
        })

        return binding.root
    }

}