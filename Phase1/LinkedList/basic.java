package LinkedList;

import java.util.*;

import arrays.reversearray;

public class basic {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
         //step-1 Creat new
              Node newNode=new Node(data);
              size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 new node next=head
        newNode.next=head;

        //step3
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");  
            return;     
         }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();

    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;

    }
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }

    public static void main(String[] args) {
        basic ll = new basic();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
        System.out.println(size);
    }

    
}
