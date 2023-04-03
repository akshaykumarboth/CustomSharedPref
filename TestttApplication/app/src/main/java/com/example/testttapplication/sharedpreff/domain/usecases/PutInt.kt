package com.example.testttapplication.sharedpreff.domain.usecases

import com.example.testttapplication.sharedpreff.domain.PrefRepository

//use case to put integer from custom pref
class PutInt(
    private val repo: PrefRepository
) {
    suspend operator fun invoke(key: String, value: Int) = repo.putInt(key, value)
}