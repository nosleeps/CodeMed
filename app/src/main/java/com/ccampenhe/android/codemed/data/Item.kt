package com.ccampenhe.android.codemed.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "item_name") val name: String,
    @ColumnInfo(name = "item_code") val itemCode: Int,
    @ColumnInfo(name = "item_favorite") val itemFavorite: Boolean
    )
