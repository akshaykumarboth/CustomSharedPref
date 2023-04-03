package com.example.testttapplication.sharedpreff.domain.usecases

import com.example.testttapplication.sharedpreff.domain.PrefRepository


//use case to get string from custom pref
class GetString(
    private val repo: PrefRepository
) {
    suspend operator fun invoke(key: String) = repo.getString(key)
}