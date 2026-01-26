package phase2.Basichashing;
import java.util.HashMap;

public class SumofHighestandLowestFrequency {
    public static  int sumHighestAndLowestFrequency(int[] nums) {
        
        // Variable to store the size of array
        int n = nums.length;
        
        /* Variable to store maximum 
        and minimum frequency */
        int maxFreq = 0, minFreq = n; 
        
        // HashMap
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        // Iterating on the array
        for (int i = 0; i < n; i++) {
            // Updating hashmap 
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
            
        // Iterate on the map
        for (int freq : mpp.values()) {
            /* Update maximum and 
            minimum frequencies */ 
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }
        
        // Return the required sum
        return maxFreq + minFreq;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        
        /* Function call to get the sum of highest
        and lowest frequency in array */
        int ans = sumHighestAndLowestFrequency(nums);
        
        System.out.println("The sum of highest and lowest frequency in the array is: " + ans);
    }
}

    

