package HomeWork7.View;

import java.util.List;

import HomeWork7.Controller.NoteController;
import HomeWork7.Model.Note;

public class ButtonClick {
    private NoteController noteController;
    private View view;
    
    
    public ButtonClick(NoteController noteController, View view) {
        this.noteController = noteController;
        this.view = view;
    }

    public void put() {

        System.out.println("Hello, What do you want to do?");
        System.out.println("NONE\nREAD\nCREATE\nUPDATE\nLIST\nDELETE\nEXIT");
        
        Commands com = Commands.NONE;

        while (true) {
            String command = view.prompt("Enter command: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Unidentified command");
            }
            if (com == Commands.EXIT)
                return; 
            try {
                switch (com) {

                    case CREATE:
                        Note note = view.setNote(false);
                        noteController.saveNotes(note);
                        break;
                    case READ:
                        String id = view.prompt("ID: ");
                        Note readNote = noteController.readNote(id);
                        System.out.println(readNote);
                        break;
                    case LIST:
                        List<Note> noteList = noteController.readNoteList();
                        for (Note item : noteList) {
                            System.out.println(item);
                            System.out.println();
                        }
                        break;
                    case UPDATE:
                        Note updateNote = view.setNote(true);
                        noteController.updateNote(updateNote);
                        break;
                    case DELETE:
                        String deleteId = view.prompt("ID: ");
                        noteController.deleteNote(deleteId);
                        System.out.println("Notes " + deleteId + "deleted");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
