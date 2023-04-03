package com.example.testttapplication.sharedpreff.di

import com.example.testttapplication.sharedpreff.presentation.CustomSharedPref
import org.koin.dsl.module

val customPrefModule = module {
    single { CustomSharedPref(get()) }
}
