package HomeWork2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    public Zoo() {
        animals = new ArrayList<>(
        Arrays.asList(new Fish("Nemo","Fish Clown", "orange and white", 0,1),
        new Cat("Tom","Ocicat", "grey", 4,3)
        ,new Dog("Bob","rottweiler", "brown", 4,2), 
        new Duck("Donald","Khaki-сampbell", "white", 2,1)));
    }

    public void talk() {
        for (SpeakAble item :getSpeakAble()) {
            System.out.printf("%s\n",item.speak());

        }
    }
    public List<SpeakAble> getSpeakAble(){
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof SpeakAble){
                result.add((SpeakAble) speakItem);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<RunAble> getRunAble(){
        List<RunAble> result = new ArrayList<>();
        for (Animal runItem:animals) {
            if (runItem instanceof RunAble){
                result.add((RunAble) runItem);
            }
        }
        return result;
    }

    public List<FlyAble> getFlyAble(){
        List<FlyAble> result = new ArrayList<>();
        for (Animal flyItem:animals) {
            if (flyItem instanceof FlyAble){
                result.add((FlyAble) flyItem);
            }
        }
        return result;
    }

    public List<SwimAble> getSwimAble(){
        List<SwimAble> result = new ArrayList<>();
        for (Animal swimItem:animals) {
            if (swimItem instanceof SwimAble){
                result.add((SwimAble) swimItem);
            }
        }
        return result;
    }

    public void run() {
        for (RunAble item :getRunAble()) {
            System.out.printf("%s,%s\n",item.toString(),item.running());

        }
    }

    public void fly() {
        for (FlyAble item :getFlyAble()) {
            System.out.printf("%s,%s\n",item.toString(),item.flying());

        }
    }

    public void swim() {
        for (SwimAble item :getSwimAble()) {
            System.out.printf("%s,%s\n",item.toString(),item.swiming());

        }
    }
}
