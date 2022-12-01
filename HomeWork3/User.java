package HomeWork3;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private User user;
    
    /**
     * @param firstName
     * @param lastName
     * @param age
     */
    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", firstName, lastName, age);
    }



}
