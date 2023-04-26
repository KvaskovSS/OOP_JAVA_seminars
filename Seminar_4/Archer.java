package Seminar_4;

import java.util.Random;

public class Archer extends Warrior<Bow, BucklerShield>{
    public Archer(String name, Bow bow, BucklerShield bucklerShield,int healthPoint) {
        super(name, bow,bucklerShield, healthPoint);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}
