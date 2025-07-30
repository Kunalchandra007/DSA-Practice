package arrays.advance_questions;

public class Maxsubarraysum {
    public static void maxsubarraysum(int arr[]){
    int maxsum=Integer.MIN_VALUE;
    int currsum=0;
    for(int i=0;i<arr.length;i++){
        currsum=currsum+arr[i];
        if(currsum<0){
            currsum=0;
        }
        maxsum=Math.max(currsum,maxsum);
    }
    System.out.println("our max sum is: " +maxsum);
    
    }
     public static void maxsubarraysbruteforce(int arr[]) {
        int maxsum=Integer.MIN_VALUE;
     int currsum=0;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currsum=0;
                for (int k = start; k <= end; k++) {
                    currsum+=arr[k];
                }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                    
                }
               
            }
            System.out.println("maxsum is :"+maxsum);
        }
        public static void prefixsum(int arr[]){
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
            int prefix[]=new int[arr.length];
            prefix[0]=arr[0];
            for(int i=1;i<prefix.length;i++){
                prefix[i]=prefix[i-1]+arr[i];

            }
            for(int i=0;i<arr.length;i++){
                int start=i;
                for(int j=0;j<arr.length;j++){
                    int end=j;
                    currsum=start == 0 ? prefix[end]:prefix[end]-prefix[start-1];

                    if(maxsum<currsum){
                        maxsum=currsum;
                    }

                }
            }
            System.out.println("Maxsum is: "+maxsum);



            
        }


    public static void main(String[]args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxsubarraysum(arr);
        maxsubarraysbruteforce(arr);
        prefixsum(arr);

    }

}
