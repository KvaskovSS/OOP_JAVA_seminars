package Seminar_2_Homework;

public class FreshwaterAquarium extends Aquarium {
    private double pHLevel;
    private double hardnessLevel;

    public FreshwaterAquarium(int capacity, double pHLevel, double hardnessLevel) {
        super(capacity);
        this.pHLevel = pHLevel;
        this.hardnessLevel = hardnessLevel;
    }

    public void setHardnessLevel(double hardnessLevel) {
        this.hardnessLevel = hardnessLevel;
    }

    public double getHardnessLevel() {
        return hardnessLevel;
    }

    public void setpHLevel(double pHLevel) {
        this.pHLevel = pHLevel;
    }

    public double getpHLevel() {
        return pHLevel;
    }
}
