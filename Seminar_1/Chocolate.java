package Seminar_1;

public class Chocolate extends Product{
    private String type;

    public Chocolate(String name, Integer cost, String type) {
        super(name, cost);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %dруб", getName(), type, getCost());
    }
}
