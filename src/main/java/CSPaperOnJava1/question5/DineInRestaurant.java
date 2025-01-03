package CSPaperOnJava1.question5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DineInRestaurant implements Restaurant{
    private String name;
    private String cuisine;
    private List<String> menu;
    private int star;
    private Map<Integer, Integer> reservation;
    private int checkInTime;

    public DineInRestaurant(String name) {
        this.name = name;
        this.cuisine = "NA";
        this.star = 4;
        this.reservation = new HashMap<>(12);
        this.menu = new ArrayList<>();
        for(int i=1100; i<2200; i += 100) {
            //String n = String.valueOf(i);
            reservation.put(i, 0);
        }
    }

    public DineInRestaurant(String name, int star,String cuisine) {
        this.name = name;
        this.cuisine = cuisine;
        this.star = star;
        this.reservation = new HashMap<>(15);
        this.menu = new ArrayList<>();
        for(int i=800; i<2400; i+=100) {
            //String n = String.valueOf(i);
            reservation.put(i, 0);
        }
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
    public String makeReservation(int checkInTime) {
        int n = reservation.getOrDefault(checkInTime, 0);
        System.out.println("Seats before reservation: " + n);

        if (star == 4) {
            if (n < 5) {
                reservation.put(checkInTime, n + 1); // Correctly updates the value
                return "Reservation done!\n";
            } else {
                return "No reservation available\n";
            }
        } else {
            if (n < 50) {
                reservation.put(checkInTime, n + 1); // Correctly updates the value
                return "Reservation done!\n";
            } else {
                return "No reservation available\n";
            }
        }
    }


    @Override
    public boolean hasMoreOptions(Restaurant other) {
        return other.getNumFoodItems() < this.menu.size();
    }
}
