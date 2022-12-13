package HomeWork7.View;

import HomeWork7.Model.Note;

public interface View {
    String prompt(String message);
    Note setNote(boolean forUpdate);
}
