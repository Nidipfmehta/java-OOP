package zoo;


public class Main {
    public static void main(String[] args) {
        Zoo myzoo = new Zoo(5, "Ahmedabad", 100);
        myzoo.addAnimal("Lion");
        System.out.println("There are " + myzoo.countAnimals() + " animal(s) currently");
        System.out.println("Price of visiting this zoo is "+ myzoo.getVisitingPrice() + "Rs");
        myzoo.addAnimal("Leopard");
        System.out.println("List of animals in myZoo:");
        myzoo.displayAnimals();
        myzoo.feedAnimals();
        myzoo.addAnimal("Tiger");
        System.out.println("There are " + myzoo.countAnimals() + " animal(s) currently");
    }
}
