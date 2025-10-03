package Heaps;

import java.util.PriorityQueue;

public class pq {
    public static void main(String[]args){
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        pq.add(2);
        pq.add(4);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
    
}
