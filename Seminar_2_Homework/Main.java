package Seminar_2_Homework;

public class Main {
    public static void main(String[] args) {
        Fish nemo = new Fish("nemo", 111, 3, 5, "male");
        Fish dory = new Fish("Dory", 22.5, 2, 4, "female");
        Aquarium aquarium = new Aquarium(5);
        aquarium.addFish(nemo);
        aquarium.addFish(dory);


        //Ставая версия класса fish
        // Fish firstFish = new Fish("firstFish", 1);
        // Fish secondFish = new Fish("secondFish", 2.5);
        // Fish thirdFish = new Fish("thirdFish", 3);
        // Fish fourthFish = new Fish("fourthFish", 111111);

        // aquarium.addFish(firstFish);
        // aquarium.addFish(secondFish);
        // aquarium.addFish(thirdFish);
        // aquarium.addFish(fourthFish);

        System.out.println(aquarium.toString());
        aquarium.removeFish(nemo);
        System.out.println(aquarium);


        System.out.println("Максимальное количество рыб " + aquarium.getCapacity());
        System.out.println("Количество рыб " + aquarium.getFishCount());
        System.out.println("Количество свободного места " + aquarium.getFreeSpace());
    }
}
