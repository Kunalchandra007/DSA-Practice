import java.util.*;

// Note: The import 'Strings.reverseusingstringbuilder' seems unnecessary and might be a typo, 
// so it is removed as it would cause a compilation error if it doesn't exist.
public class nmeetinginaroom {

    // Must be static to be used by the static maxMeetings method
    public static class meeting {
        int start;
        int end;
        int pos;

        meeting(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    // Must be static to be used by the static maxMeetings method
    public static class meetingcomparator implements Comparator<meeting> {
        @Override
        public int compare(meeting o1, meeting o2) {
            // Sort by end time in ascending order (Greedy choice)
            if (o1.end < o2.end) {
                return -1;
            } else if (o1.end > o2.end) {
                return 1;
            } 
            // If end times are equal, sort by original position in ascending order (to maintain stability)
            else if (o1.pos < o2.pos) {
                return -1;
            }
            // If both are equal, we can return 1 (or 0 if pos is guaranteed unique)
            return 1; 
        }
    }

    static void maxMeetings(int start[], int end[], int n) {
        // 1. Create a list of meeting objects
        ArrayList<meeting> meet = new ArrayList<>();
        
        for(int i = 0; i < start.length; i++)
            // Store the 1-based index (i+1) as the position
            meet.add(new meeting(start[i], end[i], i + 1)); 
        
        // 2. Sort the meetings based on the meeting comparator (primarily by end time)
        meetingcomparator mc = new meetingcomparator(); 
        Collections.sort(meet, mc); 
        
        // 3. Apply the Greedy approach
        ArrayList<Integer> answer = new ArrayList<>();
        
        // The first meeting after sorting (the one that finishes earliest) is always selected
        answer.add(meet.get(0).pos);
        // 'limit' stores the end time of the last selected meeting
        int limit = meet.get(0).end; 
        
        // Iterate through the rest of the sorted meetings
        for(int i = 1; i < start.length; i++) {
            // Check if the current meeting starts AFTER the last selected meeting ended
            if(meet.get(i).start > limit) {
                // If it doesn't overlap, select it
                limit = meet.get(i).end; 
                answer.add(meet.get(i).pos);
            }
        }
        
        // 4. Print the result
        System.out.println("The order in which the meetings will be performed is ");
        for(int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }

    public static void main(String args[]) {
        int n = 6;
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 5, 7, 9, 9};
        maxMeetings(start, end, n); 
        // Expected Output: 1 2 4 5 
    }
}