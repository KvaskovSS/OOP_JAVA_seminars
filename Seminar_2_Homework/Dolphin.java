package Seminar_2_Homework;

public class Dolphin implements Swimmable {
    private double swimmingSpeed;

    public Dolphin(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }
}
