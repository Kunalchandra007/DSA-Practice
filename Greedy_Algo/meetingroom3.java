import java.util.*;

public class meetingroom3 {

    // Function to find the most booked meeting room
    public int mostBooked(int n, int[][] meetings) {
        // Step 1: Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Min-heap of free rooms (by index)
        PriorityQueue<Integer> freeRooms = new PriorityQueue<>();
        for (int i = 0; i < n; i++) freeRooms.offer(i);

        // Step 3: Min-heap of occupied rooms: (endTime, roomIndex)
        PriorityQueue<long[]> occupied = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) return Long.compare(a[1], b[1]);
            return Long.compare(a[0], b[0]);
        });

        // Step 4: Count array to track meetings per room
        int[] count = new int[n];

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            // Free up all rooms that are done before current meeting starts
            while (!occupied.isEmpty() && occupied.peek()[0] <= start) {
                freeRooms.offer((int) occupied.poll()[1]);
            }

            if (!freeRooms.isEmpty()) {
                // Assign meeting to smallest available room
                int room = freeRooms.poll();
                count[room]++;
                occupied.offer(new long[]{end, room});
            } else {
                // No room free → wait for earliest one
                long[] earliest = occupied.poll();
                long availableTime = earliest[0];
                int room = (int) earliest[1];

                // Extend meeting duration
                long duration = end - start;
                long newEnd = availableTime + duration;

                count[room]++;
                occupied.offer(new long[]{newEnd, room});
            }
        }

        // Step 5: Find the room with maximum meetings
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (count[i] > count[result]) {
                result = i;
            }
        }
        return result;
    }

    // Main function for testing
    public static void main(String[] args) {
        meetingroom3 obj = new meetingroom3();

        // Test Case 1
        int n1 = 2;
        int[][] meetings1 = {{0, 10}, {1, 5}, {2, 7}, {3, 4}};
        System.out.println("Most booked room: " + obj.mostBooked(n1, meetings1));

        // Test Case 2
        int n2 = 3;
        int[][] meetings2 = {{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        System.out.println("Most booked room: " + obj.mostBooked(n2, meetings2));
    }
}
