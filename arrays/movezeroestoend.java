public class movezeroestoend {

    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int j = -1;

        // Step 1: Find the first zero index
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, nothing to do
        if (j == -1) return;

        // Step 2: Traverse from j+1 and swap non-zero elements with nums[j]
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // swap(nums[i], nums[j])
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

