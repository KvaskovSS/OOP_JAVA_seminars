package Seminar_4;

public class KiteShield extends Shield {
    public KiteShield() {
        super("Kite Shield", 15);
    }

    @Override
    public void block() {
        System.out.println("Blocked with kite shield");
    }
}