import java.util.*;
public class bubblesort{
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    


                }


            }
        }
    } 
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,0,88};
        bubbleSort(arr);
        printArr(arr);
    }
}