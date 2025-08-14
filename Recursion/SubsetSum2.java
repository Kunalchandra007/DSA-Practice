package Recursion;
import java.util.*;

public class SubsetSum2 {

    public void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));

        for (int i = ind; i < nums.length; i++) {
            if (i != ind && nums[i] == nums[i - 1]) continue; // Skip duplicates
            ds.add(nums[i]);
            findSubsets(i + 1, nums, ds, ansList);
            ds.remove(ds.size() - 1); // Backtrack
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort to handle duplicates
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }

    public static void main(String[] args) {
        SubsetSum2 obj = new SubsetSum2();
        int[] nums = {1, 2, 2};
        
        List<List<Integer>> result = obj.subsetsWithDup(nums);
        
        System.out.println("All unique subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}