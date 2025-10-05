package Heaps;
import java.util.*;
public class pqforobjects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank; 
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    
}
