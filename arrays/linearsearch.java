package arrays;
import java.util.*;
public class linearsearch {
    public static int Linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
             if(arr[i]==key){
                return i;

        }
        }
         return -1;
       

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int key=5;
        int index= Linearsearch(arr, key);
        if(index==-1){
            System.out.println("Key not found");

        } else{
            System.out.println("key found at index:"+index);
        }   
    
    }
}