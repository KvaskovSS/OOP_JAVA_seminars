package Seminar_2_Homework;

public class Fish implements Swimmable {
    private String name;
    private double swimmingSpeed;

    public Fish(String name,double swimmingSpeed) {
        this.name = name;
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }
}