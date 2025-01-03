package CSPaperOnJava1.question5;

import java.util.ArrayList;
import java.util.List;

public class FastFoodRestaurant implements Restaurant{
    private String name;
    private String cuisine;
    private List<String> menu;

    public FastFoodRestaurant(String name) {
        this.name = name;
        this.cuisine = "NA";
        this.menu = new ArrayList<>();
    }

    public FastFoodRestaurant(String name, String cuisine) {
        this.name = name;
        this.cuisine = cuisine;
        this.menu = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCuisine() {
        return this.cuisine;
    }

    @Override
    public List<String> getMenu() {
        return this.menu;
    }

    @Override
    public void addFoodItem(String foodName) {
        if(!menu.contains(foodName)) {
            menu.add(foodName);
        }
    }

    @Override
    public void removeFoodItem(String foodName) {
        if(menu.contains(foodName)) {
            menu.remove(foodName);
        }
    }

    @Override
    public int getNumFoodItems() {
        return menu.size();
    }

    @Override
    public String makeReservation(int time) {
        return "No reservation needed!";
    }

    @Override
    public boolean hasMoreOptions(Restaurant other) {
        return other.getNumFoodItems() < this.menu.size();
    }
}
