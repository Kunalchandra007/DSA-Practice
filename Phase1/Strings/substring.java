package Strings;
import java.util.*;

public class substring {
    public static String printsubstring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(printsubstring(str, 0, 3));
    }
    
}
