package HomeWork2;

public abstract class Animal {
    protected String name;
    protected String breed;
    protected String colour;
    protected Integer countLegs;
    protected Integer age;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public Integer getCountLegs() {
        return countLegs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Animal(String name, String breed, String colour, Integer countLegs, Integer age) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.countLegs = countLegs;
        this.age = age;
    }

    @Override
    public String toString(){
        return getName();
    }
}
