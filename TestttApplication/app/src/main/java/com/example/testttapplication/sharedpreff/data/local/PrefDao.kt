package com.example.testttapplication.sharedpreff.data.local

import androidx.room.*
import com.example.testttapplication.sharedpreff.data.model.PrefData

@Dao
abstract class PrefDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(pref: PrefData)

    @Query("DELETE FROM prefs WHERE key = :key")
    abstract suspend fun delete(key: String)

    @Query("SELECT * FROM prefs WHERE key = :key")
    abstract fun getPref(key: String): PrefData

}