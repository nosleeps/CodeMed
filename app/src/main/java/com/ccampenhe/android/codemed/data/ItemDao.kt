package com.ccampenhe.android.codemed.data

import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface ItemDao {

    /**
     * Select all from Item
     */
    @Query("Select * from Item")
    fun getAll(): Flow<List<Item>>

    /**
     * Select all from Item
     * By name
     */
    @Query("Select * from Item WHERE item_name = :name")
    fun findByName(name: String): Item

    /**
     * Update reference
     * By name
     */
    @Query("UPDATE item SET item_code = :newReferemce WHERE item_name = :name")
    fun updateItemCodeByName(newReferemce: Int, name: String)
}