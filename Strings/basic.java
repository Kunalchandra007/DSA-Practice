package Strings;
import java.util.*;
public class basic {
    public static void main(String[]args){
        char arr[]={'a','b','c','d'};
        String str1="abcd";
        String str2=new String("absedcdsn");
        System.out.println(str2);

        Scanner sc= new Scanner(System.in);
        String name;
        name=sc.next();// only takes single word use nextLine for whole line
        System.out.println(name);
        
        //concatenate
        System.out.println(str1+str2);

    }
    
}
