package com.example.project2.data.repository


import androidx.lifecycle.MutableLiveData
import com.example.final_koin_mvvm.data.data.model.Movie
import com.example.final_koin_mvvm.data.data.network.MovieApi
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Call


class MainRepository(private val api: MovieApi){

    fun getAllMovies():MutableLiveData<List<Movie>>{

        val movieList= MutableLiveData<List<Movie>>()
        val errorMessage= MutableLiveData<String>()
        val response = api.getAllMovies()
        response.enqueue(object : Callback<List<Movie>> {
            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>)
            { movieList.value = response.body() }

            override fun onFailure(call: Call<List<Movie>>, t: Throwable){
                errorMessage.value= t.message
            }
        })
        return movieList



    }
}

