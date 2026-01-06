import java.util.*;
public class missingnumber {
    public static int missingnum(int arr[]){
        int n=arr.length;
        int sum=(n+1)*(n+2)/2;
        int s2=0;
        for(int i=0;i<n;i++){
            s2+=arr[i];

        }
        return sum-s2;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        System.out.println(missingnum(arr));
        }
    
}
