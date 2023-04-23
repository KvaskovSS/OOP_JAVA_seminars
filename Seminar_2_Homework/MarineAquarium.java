package Seminar_2_Homework;

public class MarineAquarium extends Aquarium {
    private double salinityLevel;

    public MarineAquarium(int capacity, double salinityLevel) {
        super(capacity);
        this.salinityLevel = salinityLevel;
    }

    public void setSalinityLevel(double salinityLevel){
        this.salinityLevel = salinityLevel;
    }

    public double getSalinityLevel(){
        return salinityLevel;
    }
}