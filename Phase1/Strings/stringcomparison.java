package Strings;
import java.util.*;

public class stringcomparison {
    public static void main(String[] args) {
        String s1="Kunal";//ek bar Kunal ban gya string to dusra bar wala bhi ussi ko point krta h 
        String s2="Kunal";
        String s3=new String("Kunal");//isme humesha naya banta h
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
         if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        System.out.println(s1.equals(s3));
    }
    
}
