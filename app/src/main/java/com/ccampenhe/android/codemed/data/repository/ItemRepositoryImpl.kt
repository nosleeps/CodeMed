package com.ccampenhe.android.codemed.data.repository

import com.ccampenhe.android.codemed.data.Item
import com.ccampenhe.android.codemed.data.ItemDao
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ItemRepositoryImpl @Inject constructor(
    private val dao: ItemDao,
): ItemRepository {

    override suspend fun getAllMedicine(): Flow<List<Item>> =
        withContext(IO) { dao.getAll() }

    override suspend fun insertMedicine(medicineName: String) {
        withContext(IO){ dao.findByName(medicineName) }
    }

    override suspend fun updateMedicine(newCode: Int,medicineName: String) {
        withContext(IO){ dao.updateItemCodeByName(newCode,medicineName) }
    }
}