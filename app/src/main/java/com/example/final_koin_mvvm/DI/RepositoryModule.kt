package com.example.final_koin_mvvm.DI

import com.example.project2.data.repository.MainRepository
import org.koin.dsl.module



val repoModule= module {
    single { MainRepository(get())
    }
}