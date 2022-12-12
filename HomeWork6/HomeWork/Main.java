package HomeWork6.HomeWork;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
		Report report1 = new ReportConsole();
        Report report2 = new ReportFile();
        Persister persister = new Persister(user);
        report1.report(user);
        report2.report(user);
        persister.save();

    }
}
