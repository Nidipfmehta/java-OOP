package hashingFunctions;

public class quadraticProbing implements ICollisionMethods {
    private int[] arr;
    private int[] indexes;
    private int n;

    public quadraticProbing() {
        arr = new int[100];
        indexes = new int[100];
    }

    public void add(int data) {
        int i=0;
        int h = data % 10;
        int index;
        int f=0;
        for (int c=0; c<100; c++) {
            i = (int) Math.pow(i,2);
            index = (h + i) % 10;
            if(indexes[index] == -1) {
                indexes[index] = data;
                break;
            }
            else {
                i++;
            }
        }
        if (f == 0) {
            System.out.println("no place to insert");
            return;
        }

    }

    public void display() {
//        if(size == 0) {
//            System.out.println("array is empty");
//            return;
//        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "\t");

        }
    }

    @Override
    public void collisionMethods() {
//        quadraticProbing darray = new quadraticProbing();
//        darray.add(1);
//        darray.add(2);
//        darray.add(3);
//        darray.display();
//        darray.add(41);
//        darray.add(52);
//        darray.add(6);
//        darray.display();
    }
}
