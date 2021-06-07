package com.example.final_koin_mvvm.UI.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.final_koin_mvvm.R
import com.example.final_koin_mvvm.data.data.model.Movie
import com.example.final_koin_mvvm.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var _binding: FragmentSecondBinding
    private val binding get() = _binding
    private lateinit var user: Movie

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { bundle ->
            user=bundle.getParcelable("user")!!

        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.detail=user
        binding.button2.setOnClickListener {
            view.findNavController().navigate(R.id.movieFragment)

        }

    }


}