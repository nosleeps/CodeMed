package com.ccampenhe.android.codemed.data

import androidx.room.Database

@Database(
    entities = [CodeMedDatabase::class],
    version = 1
)
abstract class CodeMedDatabase {
    abstract val dao: ItemDao
}