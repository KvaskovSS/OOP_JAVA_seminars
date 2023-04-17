package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Beverage> inventory;
    private double revenue;

    public CoffeeMachine() {
        inventory = new ArrayList<Beverage>();
        revenue = 0;
    }

    public CoffeeMachine addBeverage(Beverage beverage) {
        inventory.add(beverage);
        return this;
    }

    public List<Beverage> getInventory() {
        return inventory;
    }

    public Beverage findBeverage(String string){
        for (int i = 0; i < getInventory().size(); i++) {
            if (getInventory().get(i).getName().equals(string)){
                return getInventory().get(i);
            }
        }
        return null;
    }

    public Beverage sellBeverage(Beverage beverage){
        try{
            Beverage bevFound = findBeverage(beverage.getName());
            getInventory().remove(bevFound);
            revenue += bevFound.getPrice();
            System.out.println("Продан напиток: " + bevFound.getName());
            return bevFound;
        }catch(Exception ex){
            throw new RuntimeException("Напиток отсутствует в автомате.");
        }
    }

    // public void sellBeverage(Beverage beverage) {
    //     if (inventory.contains(beverage)) {
    //         inventory.remove(beverage);
    //         revenue += beverage.getPrice();
    //         System.out.println("Продан напиток: " + beverage.getName());
    //     } else {
    //         System.out.println("Напиток отсутствует в автомате.");
    //     }
    // }

    public void printInventory() {
        System.out.println("Инвентарь кофейного автомата:");
        for (Beverage beverage : inventory) {
            System.out.println(beverage.toString());
        }
    }

    public double getRevenue() {
        return revenue;
    }
}
