package Recursion;
import java.util.*;
public class combinationsum3 {
    private void helper(int ind, int sum, int n, List<List<Integer>> ans, List<Integer> temp, int k) {
        if (sum == n && k == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (sum > n || k == 0) {
            return;
        }
        for (int i = ind; i <= 9; i++) {
            if (i > n) break;
            temp.add(i);
            helper(i + 1, sum + i, n, ans, temp, k - 1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1, 0, n, ans, new ArrayList<>(), k);
        return ans;
    }
}
    

