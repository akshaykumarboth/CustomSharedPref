package com.example.testttapplication.sharedpreff.domain.usecases

import com.example.testttapplication.sharedpreff.domain.PrefRepository

//use case to get double from custom pref
class GetDouble(
    private val repo: PrefRepository
) {
    suspend operator fun invoke(key: String) = repo.getDouble(key)
}