package CSPaperOnJava1.question3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void rotateLeftAndNegateEvens(List<Integer> list, int steps) {
        if (steps < 0 || list.size() == 0) {    //length() replaced by size()
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < steps; i++) {
            int valFirst = list.remove(0);  // remove(i) replaced by remove(0)
            if (valFirst % 2 == 0) {
                list.add(valFirst * -1);
            } else {
                list.add(valFirst);
            }
        }
        for(int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        rotateLeftAndNegateEvens(list, 2);
    }

}
