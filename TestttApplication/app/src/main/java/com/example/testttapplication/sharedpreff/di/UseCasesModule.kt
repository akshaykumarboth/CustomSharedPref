package com.example.testttapplication.sharedpreff.di

import com.example.testttapplication.sharedpreff.domain.UseCases
import com.example.testttapplication.sharedpreff.domain.usecases.*
import org.koin.dsl.module


val prefUseCasesModule  = module {


    //getters
    factory {
        GetDouble(get())
    }
    factory {
        GetString(get())
    }
    factory {
        GetInt(get())
    }


    //putters
    factory {
        PutInt(get())
    }
    factory {
        PutString(get())
    }
    factory {
        PutDouble(get())
    }

    factory {
        Remove(get())
    }
    single { UseCases(
        getInt = get(),
        getString = get(),
        getDouble = get(),
        putInt = get(),
        putString = get(),
        putDouble = get(),
        remove = get(),
    )
    }

}