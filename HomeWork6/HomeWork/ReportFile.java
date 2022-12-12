package HomeWork6.HomeWork;

public class ReportFile extends Report {

    @Override
    public void report(User user) {
        System.out.println("written to file: " + user.getName());
        
    }
    
}
