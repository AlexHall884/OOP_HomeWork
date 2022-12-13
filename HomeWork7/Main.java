package HomeWork7;

import HomeWork7.Controller.NoteController;
import HomeWork7.Model.FileOperationNote;
import HomeWork7.Model.FileOperationNoteTxt;
import HomeWork7.Model.Loggable;
import HomeWork7.Model.NoteOperation;
import HomeWork7.Model.NoteOperationTxt;
import HomeWork7.View.ButtonClick;
import HomeWork7.View.Menu;
import HomeWork7.View.View;
import HomeWork7.Model.LoggerNote;

public class Main {
    public static void main(String[] args) {
        View view = new Menu();
        FileOperationNote fileOperationNote = new FileOperationNoteTxt("HomeWork7/notes.txt");
        NoteOperation noteOperation = new NoteOperationTxt(fileOperationNote, new LoggerNote("HomeWork7/log.txt"));
        NoteController noteController = new NoteController(noteOperation);
        ButtonClick buttonClick = new ButtonClick(noteController, view);
        buttonClick.put();
    }
}
