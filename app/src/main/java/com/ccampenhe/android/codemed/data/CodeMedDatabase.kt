package com.ccampenhe.android.codemed.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CodeMedDatabase::class],
    version = 1
)
abstract class CodeMedDatabase:RoomDatabase() {
    abstract val dao: ItemDao
}