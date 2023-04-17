package Seminar_1;

public class Beverage {
    private String name;
    private double volume;
    private double temperature;
    private double price;

    public Beverage(String name, double volume, double temperature, double price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2fмл, %.2fC, %.2fруб", name, volume, temperature, price);
    }
}
