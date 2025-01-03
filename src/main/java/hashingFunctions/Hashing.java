package hashingFunctions;

public class Hashing {
    private int[] arr;
    private int[] indexes;
    private int data;
    private ICollisionMethods iCollisionMethods;

    public Hashing(int data, ICollisionMethods iCollisionMethods) {
        arr = new int[100];
        indexes = new int[100];
        this.data = data;
    }

    public void display() {
        iCollisionMethods.collisionMethods();
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
