package com.floodline.android.pokerbuddy_bankrollmanagement.models;

/**
 * Created by Wraith on 11/14/2017.
 */

public class SessionNotes {
    private int NoteID;
    private int CoreID;
    private String Note;
    private String NoteTime;

    public SessionNotes(){};

    public int getNoteID() {
        return NoteID;
    }

    public void setNoteID(int noteID) {
        NoteID = noteID;
    }

    public int getCoreID() {
        return CoreID;
    }

    public void setCoreID(int coreID) {
        CoreID = coreID;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public String getNoteTime() {
        return NoteTime;
    }

    public void setNoteTime(String noteTime) {
        NoteTime = noteTime;
    }
}
