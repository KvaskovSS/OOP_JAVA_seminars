package Seminar_4;

public class BucklerShield extends Shield {
    public BucklerShield() {
        super("Buckler Shield", 5);
    }

    @Override
    public void block() {
        System.out.println("Blocked with buckler shield");
    }
}