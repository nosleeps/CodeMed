package com.ccampenhe.android.codemed

import android.app.Application
import androidx.room.Room
import androidx.test.espresso.core.internal.deps.dagger.Module
import androidx.test.espresso.core.internal.deps.dagger.Provides
import com.ccampenhe.android.codemed.data.CodeMedDatabase
import com.ccampenhe.android.codemed.data.repository.ItemRepository
import com.ccampenhe.android.codemed.data.repository.ItemRepositoryImpl
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    @Singleton
    fun provideMyDataBase(app: Application): CodeMedDatabase {
        return Room.databaseBuilder(
            app,
            CodeMedDatabase::class.java,
            "CodeMedDB"
        ).build()
    }

    @Provides
    @Singleton
    fun provideMyRepository(db:CodeMedDatabase) : ItemRepository {
        return ItemRepositoryImpl(db.dao)
    }
}