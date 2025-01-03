package class1.hashing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String string = "nidip";
        ArrayList<Boolean> arr = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            arr.add(Boolean.FALSE);
        }
        for(int i = 0; i < string.length(); i++){
            int index = string.charAt(i) - 'a';
            if(arr.get(index)){
                System.out.println("First repeated index at " + i);
                return;
            }
            else{
                arr.set(index, Boolean.TRUE);
            }
        }
        System.out.println("No repeating elements found");
    }
}
