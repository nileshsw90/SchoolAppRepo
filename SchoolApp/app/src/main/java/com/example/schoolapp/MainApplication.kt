package com.example.schoolapp

import android.app.Application
import com.example.schoolapp.room.WordRepository
import com.example.schoolapp.room.WordRoomDatabase
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MainApplication : Application(){
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}