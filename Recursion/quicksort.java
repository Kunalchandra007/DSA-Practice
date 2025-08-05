package Recursion;
import java.util.*;
public class quicksort{
   public static void quicksorrt(int[]arr,int low,int high){
    if(low<high){
        int pIndex=partition(arr,low,high);
        quicksorrt(arr, low, pIndex-1);
        quicksorrt(arr, pIndex+1, high);
    }
   }
   public static int partition(int[]arr,int low,int high){
    int pivot=arr[low];
    int i=low;
    int j=high;
    while(i<j){
        while(i<=high-1&& arr[i]<=pivot){
            i++;
        }
        while(j>=low+1&&arr[j]>pivot){
            j--;
        }
        if(i<j){
            swap(arr,i,j);
        }
    }
    swap(arr,low,j);
    return j;
   }
   public static void swap(int []arr,int i ,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

   }
   public static int[]quickSortt(int[]arr){
    quicksorrt(arr, 0, arr.length-1);
    return arr;
   }
   public static void main(String[]args){
    int []arr={9,4,7,6,3,1,5};
    quickSortt(arr);
    System.out.println("Sorted array"+Arrays.toString(arr));
   }
}

