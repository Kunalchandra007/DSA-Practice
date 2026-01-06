import java.util.*;

public class meetingroom3 {

    // Solution function
    public int mostBooked(int n, int[][] meetings) {
        int[] count = new int[n];       // Count of meetings per room
        long[] busy = new long[n];      // When each room becomes free

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];
            long earliest = Long.MAX_VALUE;
            int roomIndex = -1;
            boolean assigned = false;

            // Try to assign the meeting
            for (int i = 0; i < n; i++) {
                if (busy[i] < earliest) {
                    earliest = busy[i];
                    roomIndex = i;
                }
                if (busy[i] <= start) {
                    busy[i] = end;
                    count[i]++;
                    assigned = true;
                    break;
                }
            }

            // If no room free, delay meeting in earliest room
            if (!assigned) {
                busy[roomIndex] += (end - start);
                count[roomIndex]++;
            }
        }

        // Find the room with maximum meetings
        int max = 0, res = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > max) {
                max = count[i];
                res = i;
            }
        }
        return res;
    }

    // Main method for testing
    public static void main(String[] args) {
        meetingroom3 obj = new meetingroom3();

        // Test Case 1
        int n1 = 2;
        int[][] meetings1 = {{0, 3}, {1, 5}, {2, 7}, {3, 4}};
        System.out.println("Most booked room: " + obj.mostBooked(n1, meetings1));

        // Test Case 2
        int n2 = 3;
        int[][] meetings2 = {{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        System.out.println("Most booked room: " + obj.mostBooked(n2, meetings2));
    }
}

//for leetcode
// class Solution {
//     public int mostBooked(int n, int[][] meetings) {
//         int[] count = new int[n];       // Count of meetings per room
//         long[] busy = new long[n];      // When each room becomes free

//         Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

//         for (int[] meeting : meetings) {
//             int start = meeting[0], end = meeting[1];
//             long earliest = Long.MAX_VALUE;
//             int roomIndex = -1;
//             boolean assigned = false;

//             // Check each room
//             for (int i = 0; i < n; i++) {
//                 if (busy[i] < earliest) {
//                     earliest = busy[i];
//                     roomIndex = i;
//                 }
//                 // If this room is free at 'start'
//                 if (busy[i] <= start) {
//                     busy[i] = end;       // Assign meeting
//                     count[i]++;          // Increment count
//                     assigned = true;
//                     break;               // Stop, since we found a room
//                 }
//             }

//             // If no room was free
//             if (!assigned) {
//                 busy[roomIndex] += (end - start);  // Delay meeting
//                 count[roomIndex]++;
//             }
//         }

//         // Find room with max count
//         int max = 0, res = 0;
//         for (int i = 0; i < n; i++) {
//             if (count[i] > max) {
//                 max = count[i];
//                 res = i;
//             }
//         }
//         return res;
//     }
// }
