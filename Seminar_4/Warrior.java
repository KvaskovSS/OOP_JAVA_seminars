package Seminar_4;

import java.util.Random;

public abstract class Warrior<T extends Weapon, S extends Shield> {
    private String name;
    protected T weapon;
    protected S shield;
    private int healthPoint;

    public Warrior(String name, T weapon, S shield, int healthPoints) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public S getShield() {
        return shield;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }


    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s,  shield %s, healthPoint %d", name, weapon, shield,  healthPoint);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public void block() {
        shield.block();
    }

}
