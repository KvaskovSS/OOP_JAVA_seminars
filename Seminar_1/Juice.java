package Seminar_1;

public class Juice extends Product{
    private String brand;
    private double volume;

    public Juice(String name, Integer cost, String brand, double volume) {
        super(name, cost);
        this.brand = brand;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2fл, %dруб.", super.getName(), brand, volume, super.getCost());
    }
}
