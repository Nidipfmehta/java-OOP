package hashingFunctions;

public class doubleHashing implements ICollisionMethods{
    private int[] arr;
    private int[] indexes;
    private int n;

    public doubleHashing() {
        arr = new int[100];
        indexes = new int[100];
    }

    public void add(int data) {
        //int i=0;
        int h = data % 10;
        int f=0;
        if(indexes[h] == -1) {

            indexes[h] = data;
        }
        else {
            int index = 97 - (data % 97);
            indexes[index] = data;
        }
        if (f == 0) {
            System.out.println("no place to insert");
            return;
        }

    }

    public void display() {
//        if() {
//            System.out.println("array is empty");
//            return;
//        }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

    }

    @Override
    public void collisionMethods() {
        doubleHashing darray = new doubleHashing();
        darray.add(1);
        darray.add(2);
        darray.add(3);
        darray.display();
        darray.add(41);
        darray.add(52);
        darray.add(6);
        darray.display();
    }
}
