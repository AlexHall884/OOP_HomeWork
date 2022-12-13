package HomeWork7.Controller;

import java.util.List;

import HomeWork7.Model.Note;
import HomeWork7.Model.NoteOperation;

public class NoteController {
    private NoteOperation noteOperation;

    public NoteController(NoteOperation noteOperation) {
        this.noteOperation = noteOperation;
    }

    public void saveNotes(Note note) throws Exception{
        validateNote(note);
        noteOperation.CreateNote(note);

    }

    public List<Note> readNoteList() {
        return noteOperation.getAllNote();
    }

    public Note readNote(String noteId) throws Exception {
        return noteOperation.readNote(noteId);
    }

    public Note updateNote(Note note) throws Exception {
        validateNote(note);
        return noteOperation.updateNote(note);
    }

    public void deleteNote(String deleteId) throws Exception {
        noteOperation.deleteNote(deleteId);
    }

    private void validateNote(Note note) throws Exception {
        if (note.getDate().isEmpty()) {
            throw new Exception("Data not found");
        }
        if (note.getHeader().isEmpty()) {
            throw new Exception("Header not found");
        }
        if (note.getText().isEmpty()) {
            throw new Exception("Text not found");
        }
    }
}
