package HomeWork7.Model;

import java.util.ArrayList;
import java.util.List;

public class NoteOperationTxt implements NoteOperation {
    
    private NoteMapper noteMapper = new NoteMapper();
    private FileOperationNote fileOperationNote;
    private Loggable logger;
    
    
    

    public NoteOperationTxt(FileOperationNote fileOperationNote, Loggable logger) {
        this.fileOperationNote = fileOperationNote;
        this.logger = logger;
    }

    @Override
    public List<Note> getAllNote() {
        List<String> lines = fileOperationNote.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(noteMapper.map(line));
        }
        logger.Log("all notes received");
        return notes;
    }

    @Override
    public String CreateNote(Note note) {
        List<Note> notes = getAllNote();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveNotes(notes);
        logger.Log("Create note");
        return id;
        
    }

    public void saveNotes(List<Note> notes){
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(noteMapper.map(item));
        }
        fileOperationNote.saveAllLines(lines);
        logger.Log("Save note");
    }

    @Override
    public Note updateNote(Note note) throws Exception {
        List<Note> notes = getAllNote();
        Note foundedNote = findNoteById(notes, note.getId());
        foundedNote.setDate(note.getDate());
        foundedNote.setHeader(note.getHeader());
        foundedNote.setText(note.getText());
        saveNotes(notes);
        logger.Log("Update note");
        return foundedNote;
    }

    public Note findNoteById(List<Note> notes, String noteId) throws Exception {
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
            logger.Log("Find by ID note");
        }
        throw new Exception("Note dont found");
    }

    @Override
    public Note readNote(String noteId) throws Exception {
        List<Note> notes = getAllNote();
        logger.Log("Read note");
        return findNoteById(notes, noteId);
    }

    @Override
    public void deleteNote(String deleteId) throws Exception {
        List<Note> notes = getAllNote();
        Note deleteNote = findNoteById(notes, deleteId);
        notes.remove(deleteNote);
        saveNotes(notes);
        logger.Log("Delete note");
    }
    
}
