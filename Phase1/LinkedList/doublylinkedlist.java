package LinkedList;

public class doublylinkedlist {
    
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add to the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Delete from the beginning of the list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete from the end of the list
    public void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    // Reverse the doubly linked list
    public void reverse() {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        // Swap head and tail
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Print list forward
    public void printForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print list backward
    public void printBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Return size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        doublylinkedlist dll = new doublylinkedlist();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printForward();   // 1 <-> 2 <-> 3 <-> null

        dll.addLast(4);
        dll.addLast(5);
        dll.printForward();   // 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> null
        dll.printBackward();  // 5 <-> 4 <-> 3 <-> 2 <-> 1 <-> null

        dll.deleteFirst();    // delete 1
        dll.deleteLast();     // delete 5
        dll.printForward();   // 2 <-> 3 <-> 4 <-> null

        dll.reverse();        // reverse the list
        dll.printForward();   // 4 <-> 3 <-> 2 <-> null
        dll.printBackward();  // 2 <-> 3 <-> 4 <-> null

        System.out.println("Size: " + dll.getSize());
    }
}
