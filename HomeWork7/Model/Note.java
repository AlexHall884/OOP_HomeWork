package HomeWork7.Model;

public class Note {
    private String id;
    private String date;
    private String header;
    private String text;
    
    public Note(String id, String date, String header, String text) {
        this.id = id;
        this.date = date;
        this.header = header;
        this.text = text;
    }

    public Note(String date, String header, String text) {
        this.date = date;
        this.header = header;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        
        return String.format("ID: %s\n Date - %s\n Header: %s\n Text: %s;", id, date, header, text);
    }
}
