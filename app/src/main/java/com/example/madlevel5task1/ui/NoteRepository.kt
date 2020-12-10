package com.example.madlevel5task1.ui


import android.content.Context
import androidx.lifecycle.LiveData
import com.example.madlevel5task1.Note
import com.example.madlevel5task1.database.NoteDao

class NoteRepository(context: Context) {

    private val noteDao: NoteDao

    init {
        val database = NotepadRoomDatabase.getDatabase(context)
        noteDao = database!!.noteDao()
    }

    fun getNotepad(): LiveData<Note?> {
        return noteDao.getNotepad()
    }

    suspend fun updateNotepad(note: Note) {
        noteDao.updateNote(note)
    }

}
