package CSPaperOnJava1.question6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void mirrorSplit(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        s2q(s, q);
        q2s(q, s);
        s2q(s, q);
        while (!q.isEmpty()) {
            int val = q.remove();
            int first = (val) / 2;
            int second = (val + 1)/ 2;
            s.push(first);
            q1.add(second);
        }
        s2q(s, q1);
        q2s(q1, s);
    }

    public static void s2q(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void q2s(Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(14);
        stack.push(20);
        stack.push(8);
        stack.push(12);
        System.out.println("before : " + stack);
        mirrorSplit(stack);
        System.out.println("after : " + stack);
    }
}
