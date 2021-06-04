package com.example.final_koin_mvvm.DI

import com.example.final_koin_mvvm.data.data.network.MovieApi
import org.koin.dsl.module


val appModule= module {
    single { MovieApi.getInstance() }
}
