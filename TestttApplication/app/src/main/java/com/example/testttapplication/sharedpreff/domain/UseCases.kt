package com.example.testttapplication.sharedpreff.domain


import com.example.testttapplication.sharedpreff.domain.usecases.*

data class UseCases(
    val getInt: GetInt,
    val getString: GetString,
    val getDouble: GetDouble,
    val putInt: PutInt,
    val putString: PutString,
    val putDouble: PutDouble,
    val remove: Remove
)