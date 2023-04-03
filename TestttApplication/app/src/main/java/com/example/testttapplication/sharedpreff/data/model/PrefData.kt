package com.example.testttapplication.sharedpreff.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Prefs")
data class PrefData(
    @PrimaryKey
    var key : String = "",
    val valueString: String? = null,
    val valueInt: Int? = null,
    val valueDouble: Double? = null
)
