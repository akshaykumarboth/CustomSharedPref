package com.example.testttapplication.sharedpreff.domain.usecases

import com.example.testttapplication.sharedpreff.domain.PrefRepository


//use case to get integer from custom pref
class GetInt(
    private val repo: PrefRepository
) {
    suspend operator fun invoke(key: String) = repo.getInt(key)
}