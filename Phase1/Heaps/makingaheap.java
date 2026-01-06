package Heaps;

import java.util.*;

public class makingaheap {
    //static class Student implements Comparable<Student>{
      //  String name;
       // int rank;

        //public Student(String name,int rank){
    //         this.name=name;
    //         this.rank=rank;
    //     }

    //     @Override
    //     public int compareto(Student s2){
    //         return this.rank-s2.rank;
    //     }
    // }
    public static void main(String args[]) {
        // 1, 2, 3, 4, 5
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); //O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(log n)
        }
    }
    
}
