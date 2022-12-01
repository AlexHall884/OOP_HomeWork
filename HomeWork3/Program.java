package HomeWork3;

public class Program {
    public static void main(String[] args) {
        User a = new User("Alex", "Black", 35);
        //System.out.println(a);

        MyList<User> userList = new MyList<>(null);
        userList.add(new User("Tom", "Freeman", 43));
        userList.add(new User("Jhony", "Camble", 32));
        userList.add(new User("Sara", "Conor", 25));

        for (User user : userList ) {
            System.out.println(user);
        }

        System.out.println("Числа:");

        MyList<Integer> intList = new MyList<>(null);
        intList.add(43);
        intList.add(32);
        intList.add(31);

        for (Integer item : intList ) {
            System.out.println(item);
        }
        
        System.out.println("Строки:");
        
        MyList<String> stList = new MyList<>(null);
        stList.add("Tom");
        stList.add("Jhony");
        stList.add("Sara");

        for (String item : stList ) {
            System.out.println(item);
        }
    }

    
}
