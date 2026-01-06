package DP;

public class uniquepaths2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[][] dp = new int[n][m];

        // Base case: starting cell
        if (obstacleGrid[0][0] == 1) return 0;
        dp[0][0] = 1;

        // Fill the dp table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0; // obstacle cell
                } else if (i == 0 && j == 0) {
                    dp[i][j] = 1; // already handled
                } else {
                    int up = 0, left = 0;
                    if (i > 0) up = dp[i - 1][j];
                    if (j > 0) left = dp[i][j - 1];
                    dp[i][j] = up + left;
                }
            }
        }

        return dp[n - 1][m - 1];
    }
    public static void main(String[] args) {
        
        
    }
}
// //leetcode
//  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int n = obstacleGrid.length;
//         int m = obstacleGrid[0].length;

//         int[][] dp = new int[n][m];

//         // Base case: starting cell
//         if (obstacleGrid[0][0] == 1) return 0;
//         dp[0][0] = 1;

//         // Fill the dp table
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (obstacleGrid[i][j] == 1) {
//                     dp[i][j] = 0; // obstacle cell
//                 } else if (i == 0 && j == 0) {
//                     dp[i][j] = 1; // already handled
//                 } else {
//                     int up = 0, left = 0;
//                     if (i > 0) up = dp[i - 1][j];
//                     if (j > 0) left = dp[i][j - 1];
//                     dp[i][j] = up + left;
//                 }
//             }
//         }

//         return dp[n - 1][m - 1];
//     }