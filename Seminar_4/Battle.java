package Seminar_4;

public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
        
    }
    public Warrior fight() {
        while(one.getHealthPoint() > 0 && two.getHealthPoint() > 0){
            int hitOne = one.hit();
            if(hitOne < two.getShield().getDefensePoints())
            {
                System.out.print("Two warrior ");
                two.block();
            }
            else{
                System.out.printf("One warrior hit damge %s. \n", hitOne);
                two.setHealthPoint(two.getHealthPoint() - hitOne);
                System.out.printf("Two warrior have healthPoint %s. \n", two.getHealthPoint());
                if(two.getHealthPoint() <= 0){
                    return one;
                }
            }
            int hitTwo = two.hit();
            if(hitTwo < one.getShield().getDefensePoints())
            {
                System.out.print("One warrior ");
                one.block();
            }
            else{
                System.out.printf("Two warrior hit damge %s. \n", hitTwo);
                one.setHealthPoint(one.getHealthPoint() - hitTwo);
                System.out.printf("One warrior have healthPoint %s. \n", one.getHealthPoint());
            }
        }
        return two;
    }
}
