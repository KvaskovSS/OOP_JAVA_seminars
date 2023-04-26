package Seminar_4;

public class Assasin extends Warrior<Knife, HeaterShield>{

    public Assasin(String name, Knife knife, HeaterShield heaterShield, int healthPoint) {
        super(name, knife, heaterShield,healthPoint);
    }
    
    @Override
    public String toString() {
        return String.format("Assasin %s", super.toString());
    }
}
