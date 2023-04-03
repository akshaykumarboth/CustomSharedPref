package com.example.testttapplication.sharedpreff.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.testttapplication.sharedpreff.data.local.PrefDao
import com.example.testttapplication.sharedpreff.data.local.PrefDatabase
import org.koin.dsl.module

val prefDBModule = module {

    fun provideDb(application: Application): PrefDatabase {
        val db = Room.databaseBuilder(
            application,
            PrefDatabase::class.java, "pref_db"
        ).fallbackToDestructiveMigration()
            .setJournalMode(RoomDatabase.JournalMode.AUTOMATIC).addCallback(object :
                RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    println("=====================PrefsDB onCreate")
                }

                override fun onOpen(db: SupportSQLiteDatabase) {
                    super.onOpen(db)
                    println("=====================PrefsDB onOpen")
                }

                override fun onDestructiveMigration(db: SupportSQLiteDatabase) {
                    super.onDestructiveMigration(db)
                    println("=====================PrefsDB onDestructiveMigration")
                }
            }).build()

        println("========================PrefsDB db=== $db")
        return db
    }

    fun providePrefDao(db: PrefDatabase): PrefDao {
        return db.prefDao()
    }

    single { provideDb(get()) }
    single { providePrefDao(get<PrefDatabase>()) }
}