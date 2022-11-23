package HomeWork2;

public class Duck extends Animal implements SpeakAble, RunAble, FlyAble, SwimAble{
    public Duck(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String flying() {
        return "90 км/ч";
    }

    @Override
    public String running() {
        return "10 km/h";
    }

    @Override
    public String speak() {
        return "quack-quack";
    }

    @Override
    public String swiming() {
        return "8 km/h";
    }
}
