package DP;

import java.util.Arrays;

public class frogjump {
        static int f(int ind, int[] heights, int[] dp) {
        if (ind == 0) return 0;
        if (dp[ind] != -1) return dp[ind];

        int left = f(ind - 1, heights, dp) + Math.abs(heights[ind] - heights[ind - 1]);
        int right = Integer.MAX_VALUE;

        if (ind > 1)
            right = f(ind - 2, heights, dp) + Math.abs(heights[ind] - heights[ind - 2]);

        return dp[ind] = Math.min(left, right);
    }

    static int frogJump(int n, int[] heights) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f(n - 1, heights, dp);
    }

    public static void main(String[] args) {
        int[] heights = {30, 10, 60, 10, 60, 50};
        int n = heights.length;
        System.out.println(frogJump(n, heights)); // Example output
    }
    
}
