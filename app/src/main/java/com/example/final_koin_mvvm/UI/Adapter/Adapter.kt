package com.example.final_koin_mvvm.UI.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.final_koin_mvvm.R
import com.example.final_koin_mvvm.data.data.model.Movie
import com.example.final_koin_mvvm.databinding.SingleItemBinding

class Adapter(private val movies: List<Movie>):
        RecyclerView.Adapter <Adapter.MovieViewHolder>(){

    override fun getItemCount(): Int {
        return movies.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.single_item,parent,false))

    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }

    class MovieViewHolder(private val singleItemBinding: SingleItemBinding):
            RecyclerView.ViewHolder(singleItemBinding.root){
        fun bindMovie(movie:Movie) {
            singleItemBinding.movie=movie

        }
            }

}


















