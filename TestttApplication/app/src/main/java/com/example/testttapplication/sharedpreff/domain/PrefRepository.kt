package com.example.testttapplication.sharedpreff.domain

interface PrefRepository {

    suspend fun getInt(key: String): Int?
    suspend fun getString(key: String): String?
    suspend fun getDouble(key: String): Double?

    suspend fun putInt(key: String, value: Int)
    suspend fun putString(key: String, value: String)
    suspend fun putDouble(key: String, value: Double)

    suspend fun delete(key: String)
}