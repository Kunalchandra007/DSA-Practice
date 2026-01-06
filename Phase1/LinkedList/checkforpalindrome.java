package LinkedList;

public class checkforpalindrome {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.next = null;
            this.data = data;
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

    // Helper: Reverse and return new head
    public static Node reverseLL(Node node) {
        Node prev = null;
        Node curr = node;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Check if list is palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Step 1: Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalfHead = reverseLL(slow.next);
        Node firstHalf = head;
        Node secondHalf = secondHalfHead;

        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                reverseLL(secondHalfHead); // Restore
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        reverseLL(secondHalfHead); // Optional: Restore original list
        return true;
    }

    public static void main(String[] args) {
        checkforpalindrome ll = new checkforpalindrome();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);

        ll.print();
        System.out.println("Is Palindrome? " + isPalindrome(head));
    }
}
