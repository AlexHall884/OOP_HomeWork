package HomeWork6.HomeWorkNotes.Model;

import java.util.List;

public interface NoteOperations {
    List<Note> getAllNote();
    String CreateNote(Note note);
    Note updateNote(Note note) throws Exception;
    Note readNote(String noteId) throws Exception;
    void deleteNote(Note deleteNote) throws Exception;
}
