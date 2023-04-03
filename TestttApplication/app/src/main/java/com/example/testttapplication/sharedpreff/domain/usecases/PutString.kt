package com.example.testttapplication.sharedpreff.domain.usecases

import com.example.testttapplication.sharedpreff.domain.PrefRepository


//use case to put String from custom pref
class PutString(
    private val repo: PrefRepository
) {
    suspend operator fun invoke(key: String, value: String) = repo.putString(key, value)
}