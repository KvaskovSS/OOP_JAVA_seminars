package Seminar_2_Homework;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishes;
    private int capacity; 

    public Aquarium(int capacity) {
        this.capacity = capacity;
        fishes = new ArrayList<>();
    }

    public void addFish(Fish fish) {
        if (fishes.size() < capacity) {
            fishes.add(fish);
            System.out.println(fish.getName() + " Добавлена в аквариум");
        } else {
            System.out.println(" Аквариум переполнен");
        }
    }

    public void removeFish(Fish fish) {
        if (fishes.contains(fish)) {
            fishes.remove(fish);
            System.out.println(fish.getName() + " Удалена из аквариума");
        } else {
            System.out.println(fish.getName() + " Нет в аквариуме");
        }
    }

    public List<Fish> getFishes() {
        return fishes;
    }

    public int getFishCount() {
        return fishes.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFreeSpace() {
        return capacity - fishes.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В аквариуме находятся ").append(fishes.size()).append(" Из максимального количества ").append(capacity);
        for (Fish fish : fishes) {
            sb.append(fish.getName()).append(", ");
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }


}
