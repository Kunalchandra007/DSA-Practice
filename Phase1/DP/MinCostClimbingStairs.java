package DP;

import java.util.Arrays;

public class MinCostClimbingStairs {
    static int f(int ind, int[] cost, int[] dp) {
        if (ind == 0) return cost[0];
        if (ind == 1) return cost[1];
        if (dp[ind] != -1) return dp[ind];

        int oneStep = f(ind - 1, cost, dp) + cost[ind];
        int twoStep = f(ind - 2, cost, dp) + cost[ind];

        return dp[ind] = Math.min(oneStep, twoStep);
    }

    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        // You can reach the top from either the last step or the second last step
        return Math.min(f(n - 1, cost, dp), f(n - 2, cost, dp));
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost)); // Output: 15
    }

    
}
