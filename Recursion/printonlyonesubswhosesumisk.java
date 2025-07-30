package Recursion;

import java.util.ArrayList;
import java.util.List;

public class printonlyonesubswhosesumisk {
    public static boolean printSubset(int ind, List<Integer> ds, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (int it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }

        // pick
        ds.add(arr[ind]);
        s += arr[ind];
        if (printSubset(ind + 1, ds, s, sum, arr, n)) {
            return true;
        }

        // backtrack and not pick
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        if (printSubset(ind + 1, ds, s, sum, arr, n)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        List<Integer> ds = new ArrayList<>();

        printSubset(0, ds, 0, sum, arr, n);
    }
}
    

