package HomeWork7.View;

import java.util.Scanner;

import HomeWork7.Model.Note;

public class Menu implements View {

    public Menu(){
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public Note setNote(boolean forUpdate) {
        String idString = null;
        if (forUpdate) {
            idString = prompt("ID: ");
        }
        String date = prompt("Date: ");
        String header = prompt("Header: ");
        String text = prompt("Text: ");
        if (forUpdate) {
            return new Note(idString, date, header,text);
        }
        return new Note(date, header,text);
    }
    
}
