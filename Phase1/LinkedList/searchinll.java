package LinkedList;

public class searchinll {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deletefirst(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        tail = secondLast;
        size--;
    }

    public int itrsearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;

        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recursivesearch(int key){
        return helper(head,key);

    }

    public static void main(String[] args) {
        searchinll ll = new searchinll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
        System.out.println("Size: " + size);
        int index = ll.itrsearch(4);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");

        }
        int found=ll.recursivesearch(4);
        System.out.println(found);
    }
}
