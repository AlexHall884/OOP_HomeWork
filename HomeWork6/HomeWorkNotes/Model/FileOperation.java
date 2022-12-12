package HomeWork6.HomeWorkNotes.Model;

import java.util.List;

public interface FileOperation {
    
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
