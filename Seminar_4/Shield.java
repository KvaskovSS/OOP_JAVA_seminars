package Seminar_4;

public abstract class Shield {
    private String name;
    private int defensePoints;

    public Shield(String name, int defensePoints) {
        this.name = name;
        this.defensePoints = defensePoints;
    }

    public String getName() {
        return name;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public abstract void block();

    @Override
    public String toString() {
        return String.format("Shield %s with %d defense points", name, defensePoints);
    }
}