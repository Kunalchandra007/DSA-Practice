package arrays;
import java.util.*;
public class twosum {
    //Hashmap (Better solution)
    // public int[] twoSum(int[] nums, int target) {
    //     Map<Integer, Integer> mpp = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         int num = nums[i];
    //         int moreNeeded = target - num;
    //         if (mpp.containsKey(moreNeeded)) {
    //             return new int[]{mpp.get(moreNeeded), i};
    //         }
    //         mpp.put(num, i);
    //     }
    //     return new int[]{-1, -1}; // Or throw an IllegalArgumentException
    // }
     public static String twoSum(int n,List<Integer>nums,int target ){
        Collections.sort(nums);
        int left=0,right=n-1;
         
        while(left<right){
            int sum=nums.get(left)+nums.get(right);
            if(sum==target){
                return "YES";
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return "NO";
     }
    public static void main(String[] args) {
        int[] numsArray = {2, 5, 6, 8};
        List<Integer> numsList = new ArrayList<>();
        for (int num : numsArray) {
            numsList.add(num);
        }

        int target = 14; 
        int n = numsList.size();

        String result =twoSum(n, numsList, target);
        System.out.println("Does a pair with the target sum exist? " + result);
    }


    
}
