package com.example.final_koin_mvvm.UI.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.final_koin_mvvm.data.data.model.Movie

import com.example.project2.data.repository.MainRepository
import org.koin.core.Koin
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainViewModel(private val mainRepository: MainRepository): ViewModel(),KoinComponent{
     
     //private  val mainRepository:MainRepository by inject()
      lateinit var movieList: LiveData<List<Movie>>

     fun getMovies():LiveData<List<Movie>>{
          movieList= mainRepository.getAllMovies()
          return movieList

     }


}









