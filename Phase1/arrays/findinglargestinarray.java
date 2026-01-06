package arrays;

public class findinglargestinarray {
    public static int getlargest(int arr[]){
         int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }        }

        return largest;
        
    }
    public static void main(String[] args) {
       
        int arr[]={23,45,66,99,2,3,4,55,66,9};
        int large=getlargest(arr);
        System.out.println(large);
        
    }
    
}
