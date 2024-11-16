package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int area;
    private String address;
    private int visitingPrice;
    private List<String> animals;

    public Zoo(int area, String address, int visitingPrice) {
        this.area = area;
        this.address = address;
        this.visitingPrice = visitingPrice;
        this.animals = new ArrayList<>();
    }

    public int countAnimals() {
        return animals.size();
    }

    public void addAnimal(String animal) {
        animals.add(animal);
    }

    public void feedAnimals() {
        for (String animal : animals) {
            System.out.println("Feeding " + animal);
        }
    }

    public int getVisitingPrice() {
        return visitingPrice;
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
            return;
        }
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}