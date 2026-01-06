package Recursion;
import java.util.*;


import arrays.advance_questions.trappingrainwater;

//thought process
//if array is [2,3,6,7]
//we have to decide what to pick and what not to pick such that the combination sum is 7
//f(0,7,(for storing lets carry a ds eg arraylist))
//now make the recursion tree
//at 0th index either we will pick it or not pick it 
//we can stay at 0th index while picking as the question is saying we can pick any number of times
//after 1st pick f(0,5,ds(2))
//after 1 not pickf(1,7,ds())
//as left recursion is called first 
// so while calling the left one and picking it will be f(0,3,ds(2,2))
//not pick will be f(1,5,ds(2))
//base condition isn if(ind ==n){if(target==0) ret ds else return}
public class Combinationsum {
    // Recursive helper method
    public static void combinationSumHelper(int ind, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            combinationSumHelper(ind, arr, target - arr[ind], ds, ans); // pick the element again
            ds.remove(ds.size() - 1); // backtrack
        }

        combinationSumHelper(ind + 1, arr, target, ds, ans); // not pick
    }

    // Main method to call
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSumHelper(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(arr, target);

        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }
    }
}
//For leetcode
// class Solution {
//     private  void combinationsumhelper(int ind,int arr[],int target,List<Integer>ds,List<List<Integer>>ans){
//         if(ind==arr.length){
//             if(target==0){
//                 ans.add(new ArrayList<>(ds));

//             }
//             return;
//         }
//         if(arr[ind]<=target){
//             ds.add(arr[ind]);
//             combinationsumhelper(ind,arr,target-arr[ind],ds,ans);
//             ds.remove(ds.size()-1);
//         }
//         combinationsumhelper(ind+1,arr,target,ds,ans);

//     }

//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>>ans=new ArrayList<>();
//         combinationsumhelper(0,candidates,target,new ArrayList<>(),ans);
//         return ans;
        
//     }
// }
