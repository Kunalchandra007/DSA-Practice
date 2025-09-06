package Slidingwindowand2pointer;

public class Binarysubarraywithsum {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        int result = numSubarraysWithSum(nums, goal);
        System.out.println("Number of subarrays with sum = " + goal + " : " + result);
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return countAtMost(nums, goal) - countAtMost(nums, goal - 1);
    }

    private static int countAtMost(int[] nums, int goal) {
        if (goal < 0) return 0; // no subarray possible if goal < 0

        int left = 0, sum = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // shrink window if sum > goal
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            // all subarrays ending at `right` with sum ≤ goal
            count += (right - left + 1);
        }
        return count;
    }
    
}
