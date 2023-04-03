package com.example.testttapplication.sharedpreff.domain.usecases

import com.example.testttapplication.sharedpreff.domain.PrefRepository

//use case to remove from custom pref
class Remove(
    private val repo: PrefRepository
) {
    suspend operator fun invoke(key: String) = repo.delete(key)
}