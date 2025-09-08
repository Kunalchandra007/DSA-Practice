package Slidingwindowand2pointer;
import java.util.*;

import jdk.jfr.Frequency;
public class Fruitsintobasket {
    public static int fruitss(int arr[]){
        int n=arr.length;
        int k=2;
        int l=0;
        int r=0;
        int maxlen=0;
        Map<Integer,Integer>mpp=new HashMap<>();

        while(r<n){
            mpp.put(arr[r],mpp.getOrDefault(arr[r],0)+1);

            if(mpp.size()>k){
                mpp.put(arr[l],mpp.get(arr[l])-1);
                if(mpp.get(arr[l])==0){
                    mpp.remove(arr[l]);
                }
                l++;
            }
            if(mpp.size()<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
       
    }
    public static void main(String[] args) {
        int arr[]={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(fruitss(arr));
    }
    
}
