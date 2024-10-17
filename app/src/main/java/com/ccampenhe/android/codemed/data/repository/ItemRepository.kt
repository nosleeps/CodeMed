package com.ccampenhe.android.codemed.data.repository

import com.ccampenhe.android.codemed.data.Item
import kotlinx.coroutines.flow.Flow

interface ItemRepository {
    suspend fun insertMedicine(medicineName: String)
    suspend fun updateMedicine(newCode:Int, medicineName: String)
    suspend fun getAllMedicine(): Flow<List<Item>>
}