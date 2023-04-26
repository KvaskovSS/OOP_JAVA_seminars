package Seminar_4;

public class HeaterShield extends Shield {
    public HeaterShield() {
        super("Heater Shield", 10);
    }

    @Override
    public void block() {
        System.out.println("Blocked with heater shield");
    }
}
