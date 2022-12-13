package HomeWork7.Model;

import java.util.List;

public interface FileOperationNote {
    
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
