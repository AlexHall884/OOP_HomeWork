package HomeWork4;

public class Sword implements Weapon{

    @Override
    public Integer damage() {
        return 40;
    }
    @Override
    public String toString() {
        return String.format(" Sword damage: %d", damage());
    }
}
