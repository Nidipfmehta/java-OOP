package CSPaperOnJava2.question6;

import java.util.*;

public class Main {
    public static void s2q(Stack<String> s, Queue<String> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void q2s(Queue<String> q, Stack<String> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }

    public static void alphabetize(Queue<String> q) {
        if(q.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Stack<String> stack = new Stack<>();
        Queue<String> aQueue = new LinkedList<>();
        Queue<String> bQueue = new LinkedList<>();
        Queue<String> cQueue = new LinkedList<>();

        while(!q.isEmpty()) {
           String curr = q.poll();
           if(curr.charAt(0) == 'a') {
               aQueue.add(curr);
           }
           else if(curr.charAt(0) == 'b') {
               bQueue.add(curr);
           }
           else if(curr.charAt(0) == 'c') {
               cQueue.add(curr);
           }
        }
        q2s(aQueue,stack);
        s2q(stack,aQueue);
        q2s(aQueue,stack);
        s2q(stack,q);


        q2s(bQueue,stack);
        s2q(stack,bQueue);
        q2s(bQueue,stack);
        s2q(stack,q);

        q2s(cQueue,stack);
        s2q(stack,cQueue);
        q2s(cQueue,stack);
        s2q(stack,q);
    }

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("august");
        q.add("cornelia street");
        q.add("bejeweled");
        q.add("cardigan");
        q.add("afterglow");
        q.add("delicate");
        q.add("evermore");

        System.out.println("Before alphabetize: " + q);
        alphabetize(q);
        System.out.println("After alphabetize: " + q);
    }
}
