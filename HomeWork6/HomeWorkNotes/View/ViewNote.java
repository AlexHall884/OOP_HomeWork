package HomeWork6.HomeWorkNotes.View;

import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

import HomeWork6.HomeWorkNotes.Controller.NoteConroller;
import HomeWork6.HomeWorkNotes.Model.Note;

public class ViewNote {
    
    private NoteConroller noteConroller;

    public ViewNote(NoteConroller noteConroller) {
        this.noteConroller = noteConroller;
    }

    private String prompt(String message) {
        Scanner comand = new Scanner(System.in);
        System.out.print(message);
        return comand.nextLine();
    }

    private Note setNote(boolean forUpdate) {
        String idString = "";
        if (forUpdate) {
            idString = prompt("Id: ");

        }

        String data = prompt("Дата: ");
        String header = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        if (forUpdate) {
            return new Note(idString, data, header, text);
        }
        return new Note(data, header, text);
    }

    public void run() {
        System.out.println("Здравствуйте, что вы хотите сделать?");
        System.out.println("NONE\nREAD\nCREATE\nUPDATE\nLIST\nDELETE\nEXIT");
        Commands comand = Commands.NONE;
        while (true) {
            String command = prompt("Введите команду: ");
            try {
                comand = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }
            if (comand == Commands.EXIT)
                return;
            try {
                switch (comand) {
                    case CREATE:
                        Note note = setNote(false);
                        noteConroller.saveNote(note);
                        break;
                    case READ:
                        String id = prompt("Идентификатор записи: ");
                        Note readedNote = noteConroller.readNote(id);
                        System.out.println(readedNote);
                        break;
                    case LIST:
                        List<Note> noteList = noteConroller.readNoteList();
                        for (Note n : noteList) {
                            System.out.println(n);
                            System.out.println();
                        }
                        break;
                    case UPDATE:
                        Note updateNote = setNote(true);
                        noteConroller.updateNote(updateNote);
                        break;
                    case DELETE:
                           String noteId = prompt("Идентификатор записи: ");
                           Note needTodeleteNote = noteConroller.readNote(noteId);
                           noteConroller.deleteNote(needTodeleteNote);
                           break;  
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
