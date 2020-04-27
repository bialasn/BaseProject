package com.bialasn.baseproject.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bialasn.baseproject.database.dao.PostDao
import com.bialasn.baseproject.model.Post

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}