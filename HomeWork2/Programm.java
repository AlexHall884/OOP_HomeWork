package HomeWork2;
/*Создать интерфейс, скорость плаванья
Добавить новое животное, способное плавать
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре */

public class Programm {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.talk();
        System.out.println("run:");
        zoo.run();
        System.out.println("fly:");
        zoo.fly();
        System.out.println("swim:");
        zoo.swim();
    }
}
