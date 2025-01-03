package CSPaperOnJava1.question5;

import java.util.List;

public interface Restaurant {
    // Returns the name of the Restaurant
    public String getName();
    // Returns the cuisine of the Restaurant (For example: Thai or Indian)
    public String getCuisine();
    // Returns a list of items on the menu
    public List<String> getMenu();
    // Adds a food item to the menu. If the food item is already present, then there is no
// change.
    public void addFoodItem(String foodName);
    // Removes a food item from the menu.
// Throws an IllegalArgumentException if the food item does not exist.
    public void removeFoodItem(String foodName);
    // Returns the number of food items on the menu
    public int getNumFoodItems();
    // Makes a reservation at the particular restaurant. If a restaurant doesn’t take
// reservations (ex. Fast Food restaurants), then it returns “No reservation needed!”.
// If a restaurant accepts reservations, it returns “Success” or “Failure”.
    public String makeReservation(int time);
    // Returns true if this restaurant has more items than the other restaurant
// otherwise false
    public boolean hasMoreOptions(Restaurant other);
}
