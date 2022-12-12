package HomeWork6.HomeWorkNotes;

import HomeWork6.HomeWorkNotes.Controller.NoteConroller;
import HomeWork6.HomeWorkNotes.Model.FileOperation;
import HomeWork6.HomeWorkNotes.Model.FileOperationImpl;
import HomeWork6.HomeWorkNotes.Model.NoteOperationImpl;
import HomeWork6.HomeWorkNotes.Model.NoteOperations;
import HomeWork6.HomeWorkNotes.View.ViewNote;

public class Main {
    public static void main(String[] args) {
        
        FileOperationImpl fileOperationImpl = new FileOperationImpl("HomeWork6\\HomeWorkNotes\\note.txt");
        NoteOperations noteOperations = new NoteOperationImpl(fileOperationImpl);
        NoteConroller noteConroller = new NoteConroller(noteOperations);
        ViewNote viewNote = new ViewNote(noteConroller);
        viewNote.run();
    }
}
