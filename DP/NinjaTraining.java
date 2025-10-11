import java.util.*;

public class NinjaTraining {

    public static int ninjaTraining(int n, int[][] points) {
        int[] prev = new int[4];

        // Base case: Day 0 initialization
        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);
        prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        // Fill DP for days 1 → n-1
        for (int day = 1; day < n; day++) {
            int[] curr = new int[4];
            for (int last = 0; last < 4; last++) {
                curr[last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int val = points[day][task] + prev[task];
                        curr[last] = Math.max(curr[last], val);
                    }
                }
            }
            prev = curr;
        }

        return prev[3]; // max points with no restriction on last task
    }

    public static void main(String[] args) {
        int[][] points = {
            {10, 40, 70},
            {20, 50, 80},
            {30, 60, 90}
        };

        int n = points.length;
        System.out.println(ninjaTraining(n, points));  // Output: 210
    }
}
