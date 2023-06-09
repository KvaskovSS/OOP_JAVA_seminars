package Seminar_2_Homework;

public class Fish implements Swimmable {
    private String name;
    private double swimmingSpeed;
    private int age;
    private double weight;
    private String gender;

    public Fish(String name, double swimmingSpeed, int age, double weight, String gender) {
        this.name = name;
        this.swimmingSpeed = swimmingSpeed;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}