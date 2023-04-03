package com.example.testttapplication.sharedpreff.domain.usecases

import com.example.testttapplication.sharedpreff.domain.PrefRepository


//use case to put double from custom pref
class PutDouble(
    private val repo: PrefRepository
) {
    suspend operator fun invoke(key: String, value: Double) = repo.putDouble(key, value)
}