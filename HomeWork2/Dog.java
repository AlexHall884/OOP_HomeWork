package HomeWork2;

public class Dog extends Animal implements SpeakAble, RunAble{
    public Dog(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak(){
        return "arf-arf";
    }

    @Override
    public String running() {
        return "50 km/h";
    }
}
