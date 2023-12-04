package com.danigelabert.appmvvm_homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danigelabert.appmvvm_homework.databinding.FragmentLoginBinding
import com.danigelabert.appmvvm_homework.databinding.FragmentViewUserBinding

class ViewUserFragment : Fragment() {

    private lateinit var binding: FragmentViewUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewUserBinding.inflate(layoutInflater)
        return binding.root
    }

}