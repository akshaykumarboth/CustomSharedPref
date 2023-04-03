package com.example.testttapplication.sharedpreff.di

import com.example.testttapplication.sharedpreff.data.PrefRepositoryImpl
import com.example.testttapplication.sharedpreff.domain.PrefRepository
import org.koin.dsl.module

val prefRepoModule = module {
    single<PrefRepository> {
        PrefRepositoryImpl(get())
    }
}