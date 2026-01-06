package LinkedList;
import java.util.*;
public class deletefromnthfromend {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail=head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthfromend(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
        }
        //size-n
        int i=1;
        int itofind=size-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

    }
    
    public static void main(String[] args) {
       deletefromnthfromend ll = new deletefromnthfromend();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        System.out.println("Original List:");
        ll.print();

        ll.reverse();
    

        System.out.println("Reversed List:");
        ll.print();
        ll.deleteNthfromend(1);
        ll.print();
    }
}


