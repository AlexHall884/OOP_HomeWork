package HomeWork7.Model;

import java.util.List;

public interface NoteOperation {
    List<Note> getAllNote();
    String CreateNote(Note note);
    Note updateNote(Note note) throws Exception;
    Note readNote(String noteId) throws Exception;
    void deleteNote(String noteId) throws Exception;
    
} 
