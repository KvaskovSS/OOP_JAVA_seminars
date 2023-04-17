package Seminar_1;

public class Milk extends Product{
    private double volume;

    public Milk(String name, Integer cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%s %,.2fл, %dруб", getName(), volume, getCost());
    }
}
