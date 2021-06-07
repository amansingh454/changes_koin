package com.example.final_koin_mvvm.DI

import com.example.final_koin_mvvm.UI.ViewModel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val ViewModelModule= module {
    viewModel {
        MainViewModel(get())
    }


}

