package HomeWork6.HomeWorkNotes.Controller;

import java.util.List;

import HomeWork6.HomeWorkNotes.Model.Note;
import HomeWork6.HomeWorkNotes.Model.NoteOperations;

public class NoteConroller {
    private NoteOperations noteOperations;

    public NoteConroller(NoteOperations noteOperations) {
        this.noteOperations = noteOperations;
    }

    public void saveNote(Note note) throws Exception {
        validateNote(note);
        noteOperations.CreateNote(note);
    }

    public List<Note> readNoteList() {
        return noteOperations.getAllNote();
    }

    public Note readNote(String noteId) throws Exception {
        return noteOperations.readNote(noteId);
    }

    public Note updateNote(Note note) throws Exception {
        validateNote(note);
        return noteOperations.updateNote(note);
    }

    public void deleteNote(Note deleteNote) throws Exception {
        noteOperations.deleteNote(deleteNote);
    }

    private void validateNote(Note note) throws Exception {
        if (note.getData().isEmpty()) {
            throw new Exception("Отсутствует дата");
        }
        if (note.getHeader().isEmpty()) {
            throw new Exception("Отсутствует заголовок");
        }
        if (note.getText().isEmpty()) {
            throw new Exception("Отсутствует содержание");
        }
    }
}
