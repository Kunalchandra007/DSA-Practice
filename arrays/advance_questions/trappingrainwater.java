package arrays.advance_questions;

public class trappingrainwater {
    public static int traprainwater(int arr[]){
        //calculate leftmax boudary
        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        //calculate rightmax boundary
        int rightmax[]=new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        //loop
        int trappedwater=0;
        for(int i=0;i<arr.length;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-arr[i];

        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(traprainwater(arr));
        
    }
    
}
