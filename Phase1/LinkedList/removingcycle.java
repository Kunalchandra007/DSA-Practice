package LinkedList;

public class removingcycle {
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

    public static boolean iscycle(){
        Node slow=head;
        Node fast= head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }
    public static void removecycle(){
        //detec cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;

            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
         // Special case: cycle starts at head
    if (slow == fast) {
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null;
        return;
    }
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle
        prev.next=null;

    }
    
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());

    }
    
}
