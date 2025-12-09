public class MaximizePointsAfterChoosingKTasks {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n=technique1.length;
        int [][]arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=technique1[i];
            arr[i][1]=technique2[i];
            arr[i][2]=technique2[i]-technique1[i];
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[2],b[2]));
        long ans=0;
        for(int i=0;i<k;i++){
            ans+=arr[i][0];
            
        }
        for(int i=k;i<n;i++){
            ans+=Math.max(arr[i][0],arr[i][1]);
        }
        return ans;
    }
}
    
