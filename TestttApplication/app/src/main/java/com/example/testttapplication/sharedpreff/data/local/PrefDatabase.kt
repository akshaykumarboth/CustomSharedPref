package com.example.testttapplication.sharedpreff.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testttapplication.sharedpreff.data.model.PrefData


@Database(entities = arrayOf(PrefData::class), version = 1, exportSchema = false)
abstract class PrefDatabase : RoomDatabase() {
    abstract fun prefDao(): PrefDao
}