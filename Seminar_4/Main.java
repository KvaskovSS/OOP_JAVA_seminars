package Seminar_4;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("George", new Bow(), new BucklerShield(),30))
                    .add(new Archer("Bob", new Bow(), new BucklerShield(), 25));
        
        Team<Assasin> assasinTeam = new Team<>();
        assasinTeam.add(new Assasin("Ecio",new Knife(), new HeaterShield(), 20))
                    .add(new Assasin("Maria", new Knife(), new HeaterShield(), 35));

        System.out.println(archersTeam);
        System.out.println(assasinTeam);
        
        Battle placeOfBattle = new Battle(new Archer("Henry", new Bow(), new BucklerShield(), 30), 
                               new Assasin("Jonny", new Knife(), new HeaterShield(), 34));
        Warrior winner = placeOfBattle.fight();

        System.out.println(winner);
    }
    
}
