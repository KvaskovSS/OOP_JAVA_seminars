package Seminar_2_Homework;

public class Duck implements Swimmable {
    private double swimmingSpeed;

    public Duck(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }
}