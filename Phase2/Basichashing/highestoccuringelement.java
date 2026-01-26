package phase2.Basichashing;
public class highestoccuringelement {
    public static int highestoccuringel(int []arr,int n){
        int maxi=arr[0];
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int[]hash=new int[maxi+1];

        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        int maxcount=0;
        int maxel=-1;
        for(int i=0;i<=maxi;i++){
            if(hash[i]>maxcount){
                maxcount=hash[i];
                maxel=i;
            }
        }
        return maxel;

    }
    public static void main(String[] args) {
        int arr[]={1,3,2,3,4,3,2};
        int n=arr.length;
        int result=highestoccuringel(arr, n);
        System.out.println("Highestel "+result);
    }



    
}

