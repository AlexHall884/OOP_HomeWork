package HomeWork4;

public class Swordsman extends Warrior<Sword, LeatherShield>{

    public Swordsman(String name, Integer healthPoint, Sword weapon, LeatherShield shield) {
        super(name, healthPoint, weapon, shield);
        
    }
    @Override
    public String toString() {
        return String.format("Swordsman: %s ", super.toString());
    }
}
