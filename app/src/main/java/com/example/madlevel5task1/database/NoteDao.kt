package com.example.madlevel5task1.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.madlevel5task1.Note

@Dao
interface NoteDao {

    @Insert
    suspend fun insertNote(note: Note)

    @Query("SELECT * FROM noteTable LIMIT 1")
    fun getNotepad(): LiveData<Note?>

    @Update
    suspend fun updateNote(note: Note)

}
