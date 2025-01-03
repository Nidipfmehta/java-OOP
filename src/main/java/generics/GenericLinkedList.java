package generics;

import java.util.NoSuchElementException;

public class GenericLinkedList<T> {
    private class ListNode {
        T data;
        ListNode next;

        ListNode(T data) {
            this.data = data;
        }
    }

    private int size;
    private ListNode head;

    public GenericLinkedList() {
        head = null;
    }

    public void insert(int index, T data) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        ListNode newnode = new ListNode(data);
        if(index == 0) {
            newnode.next = head;
            head = newnode;
        }
        else {
            ListNode temp = head;
            for(int i=0; i<index; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        size++;
    }

    public void remove(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        if(index == 0) {
            //error of head == null
            head = head.next;
        }
        else {
            ListNode temp = head;
            for(int i=0; i<index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public void remove(T data) {
        if(head == null) {
            throw new NullPointerException("underflow");
        }
        if(head.data == data) {
            head = head.next;
            size--;
            return;
        }
        ListNode temp = head;
        while(temp.next.data != data && temp.next != null) {
            temp = temp.next;
        }
        if(temp.next == null) {
            throw new NoSuchElementException("element not found");
        }
        else {
            System.out.println("Deleted value is : " + temp.data);
            temp.next = temp.next.next;
        }
        size--;
    }

    public void reverse() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("Reversal done");
    }

    public void printLinkedList() {
        if(head == null) {
            throw new NullPointerException("underflow");
        }
        ListNode temp = head;
        for(int i=0; i<size; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
