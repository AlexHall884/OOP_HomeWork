package HomeWork4;

public class HeavyShield implements Shield {

    @Override
    public Integer absorb() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format(" Shield absorb: %d", absorb());
    }
}
