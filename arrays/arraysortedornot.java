package arrays;
public class arraysortedornot {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int drops = 0;

        // check normal drops
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                drops++;
            }
        }

        // check boundary drop (rotation point)
        if (nums[0] < nums[n - 1]) {
            drops++;
        }

        return drops <= 1;
    }

    public static void main(String[] args) {
        
        // Example array
        int[] nums = {3, 4, 5, 1, 2};

        // Function call
        boolean result = check(nums);

        // Print result
        System.out.println("Array sorted or rotated? : " + result);
    }
}
