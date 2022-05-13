package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.usecase

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class InsertNoteUseCase(
    private  val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        // validation there can be much more validations which have to be implemented
        // within tis particular use case
        if (note.title.isBlank()){
            throw InvalidNoteException("The title of the note na not be empty")
        }

        if (note.content.isBlank()){
            throw InvalidNoteException("The content of the note na not be empty")
        }
        repository.insertNote(note)
    }
}