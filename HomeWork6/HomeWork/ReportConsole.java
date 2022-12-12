package HomeWork6.HomeWork;

public class ReportConsole extends Report{

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
        
    }
    
}
