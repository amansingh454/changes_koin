package com.example.final_koin_mvvm.UI.fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf

import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.final_koin_mvvm.R
import com.example.final_koin_mvvm.UI.Adapter.Adapter


import com.example.final_koin_mvvm.UI.ViewModel.MainViewModel
import com.example.final_koin_mvvm.data.data.model.Movie
import com.example.final_koin_mvvm.databinding.FragmentMovieBinding
import com.example.final_koin_mvvm.databinding.SingleItemBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class MovieFragment : Fragment(R.layout.fragment_movie) {
    private val mainViewModel: MainViewModel by viewModel()
    private lateinit var _binding: FragmentMovieBinding
    private val binding get()=_binding
    private lateinit var singleItemBinding: SingleItemBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        _binding= FragmentMovieBinding.inflate(inflater, container, false)

        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel.getMovies()
        val movieList = mainViewModel.movieList
        movieList.observe(this.viewLifecycleOwner, Observer { binding.RecView.also {

            it.layoutManager=LinearLayoutManager(requireContext())
            it.adapter= movieList.value?.let { it1 -> Adapter(movies = it1) }
        }})
            val name=singleItemBinding.name.text.toString()
            val desc=singleItemBinding.des.text.toString()
            val cat=singleItemBinding.cat.text.toString()
            val user= Movie(name,desc,cat)
            val bundle= bundleOf("user" to user)
            view.findNavController().navigate(R.id.secondFragment,bundle)     }



    }










