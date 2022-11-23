package HomeWork2;

public class Cat extends Animal implements SpeakAble, RunAble{
    public Cat(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak(){
        return "mew-mew";
    }

    @Override
    public String running() {
        return "50 km/h";
    }
}
