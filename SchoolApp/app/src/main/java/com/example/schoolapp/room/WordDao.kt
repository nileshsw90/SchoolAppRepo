package com.example.schoolapp.room

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDao {

    @WorkerThread
    @Insert
    fun insert(word: Word)

    @WorkerThread
    @Query("DELETE FROM word_table")
    fun deleteAll()

    @WorkerThread
    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>


}