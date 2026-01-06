package Stack_Queues;
import java.util.*;

public class nextgreaterelementtwo {
    public static int[] greater(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            // Pop smaller or equal elements
            while (!st.isEmpty() && st.peek() <= nums[idx]) {
                st.pop();
            }

            // Store result only for the first pass (i < n)
            if (i < n) {
                nge[idx] = st.isEmpty() ? -1 : st.peek();
            }

            // Push current element
            st.push(nums[idx]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = greater(nums);
        System.out.println(Arrays.toString(result)); // Output: [2, -1, 2]
    }
}
