package com.qcoder.notesapp.listeners;

import com.qcoder.notesapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
