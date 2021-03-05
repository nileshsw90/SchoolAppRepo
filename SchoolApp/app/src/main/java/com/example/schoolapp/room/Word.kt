package com.example.schoolapp.room

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
class Word(word: String)  {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    var mWord : String = word

}