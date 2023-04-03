package com.example.testttapplication.sharedpreff.data

import com.example.testttapplication.sharedpreff.data.local.PrefDao
import com.example.testttapplication.sharedpreff.data.model.PrefData
import com.example.testttapplication.sharedpreff.domain.PrefRepository

class PrefRepositoryImpl(
    private val dao: PrefDao
): PrefRepository {
    override suspend fun getInt(key: String) = dao.getPref(key).valueInt

    override suspend fun getString(key: String) = dao.getPref(key).valueString

    override suspend fun getDouble(key: String) = dao.getPref(key).valueDouble

    override suspend fun putInt(key: String, value: Int) {
        dao.insert(
            PrefData(
                key = key,
                valueInt = value
            )
        )
    }

    override suspend fun putString(key: String, value: String) {
        dao.insert(
            PrefData(
                key = key,
                valueString = value
            )
        )
    }

    override suspend fun putDouble(key: String, value: Double) {
        dao.insert(
            PrefData(
                key = key,
                valueDouble = value
            )
        )
    }

    override suspend fun delete(key: String) = dao.delete(key)
}