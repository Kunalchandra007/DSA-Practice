package Slidingwindowand2pointer;
import java.util.*;

public class MaxConsecutiveOnesIII {
    public static int longest(int nums[], int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int zeroes = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeroes++;
            }

            if (zeroes > k) {
                if (nums[l] == 0) {
                    zeroes--;
                }
                l++; // move left no matter what
            }

            if (zeroes <= k) {
                int len = r - l + 1;
                maxlen = Math.max(len, maxlen);
            }

            r++; // always move right
        }

        return maxlen;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println(longest(nums, k)); // Output: 6
    }
}
