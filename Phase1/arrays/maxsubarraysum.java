public class maxsubarraysum {
    public static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
        
    }
    public static void main(String[] args) {
        int nums[]={1,2,-2,1,9,3,-2};
        System.out.println(maxSubArray(nums));
    }
}
    
//and
//  public int maxSubArray(int[] nums) {
//         int maxi = Integer.MIN_VALUE;
//         int sum = 0;

//         for (int num : nums) {
//             sum = Math.max(num, sum + num);
//             maxi = Math.max(maxi, sum);
//         }

//         return maxi;
//     }
// }
