package DP;

public class Robber2 {
    private int solve(int[] nums, int start, int end) {
        if (end - start == 1)
            return nums[start];
        
        int prev2 = nums[start];
        int prev1 = Math.max(nums[start], nums[start + 1]);
        
        for (int i = start + 2; i < end; i++) {
            int curr = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        
        return Math.max(solve(nums, 0, nums.length - 1), solve(nums, 1, nums.length));
    }
}


