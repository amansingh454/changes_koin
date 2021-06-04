package com.example.project2

import android.app.Application

import com.example.final_koin_mvvm.DI.ViewModelModule
import com.example.final_koin_mvvm.DI.appModule
import com.example.final_koin_mvvm.DI.repoModule
import org.koin.android.ext.koin.androidContext

import org.koin.core.context.startKoin




class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(repoModule, ViewModelModule, appModule))
        }
    }
}