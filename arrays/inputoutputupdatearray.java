package arrays;

import java.util.*;

public class inputoutputupdatearray {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc= new Scanner(System.in);
        //int phy;
        //phy=sc.nextInt();
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy"+marks[0]+"chem"+marks[1]+"maths"+marks[2]);
        marks[2]=23;
        System.out.println(marks[2]);
        sc.close();
    }
    
}
