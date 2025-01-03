package dynamicArray;

import java.util.Arrays;

public class dynamicArray {
    private int[] arr;
    private int size = -1;

    public dynamicArray() {
        arr = new int[3];
    }

    public void add(int data) {
        size++;
        System.out.println("length : " + size);
        if (arr.length > size) {
            arr[size] = data;
        }
        else {
            int arr_size = (int) Math.pow(size, 2);
            int[] arr_new = Arrays.copyOf(arr, arr_size);
            arr = arr_new;
            System.out.println("size increased : " + arr.length);
            arr[size] = data;
        }

    }

    public void display() {
        if(size == 0) {
            System.out.println("array is empty");
            return;
        }
        else {
            for(int i=0; i<size; i++) {
                System.out.println(arr[i] + "\t");
            }
        }
    }

    public static void main(String[] args) {
        dynamicArray darray = new dynamicArray();
        darray.add(1);
        darray.add(2);
        darray.add(3);
        darray.display();
        darray.add(4);
        darray.add(5);
        darray.add(6);
        darray.display();
    }
}
