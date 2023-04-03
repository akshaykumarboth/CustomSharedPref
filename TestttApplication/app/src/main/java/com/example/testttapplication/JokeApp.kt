package com.example.testttapplication

import android.app.Application
import com.example.testttapplication.sharedpreff.di.customPrefModule
import com.example.testttapplication.sharedpreff.di.prefDBModule
import com.example.testttapplication.sharedpreff.di.prefRepoModule
import com.example.testttapplication.sharedpreff.di.prefUseCasesModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class JokeApp: Application() {

    val prefModules = listOf(prefRepoModule, prefDBModule, prefUseCasesModule, customPrefModule)
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@JokeApp)
            modules(prefModules)
        }
    }
}
