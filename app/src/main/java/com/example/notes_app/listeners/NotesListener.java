package com.example.notes_app.listeners;

import com.example.notes_app.entities.Note;

public interface NotesListener {

    void onNoteClicker(Note note, int position);
}