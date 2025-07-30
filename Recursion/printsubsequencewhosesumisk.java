package Recursion;
import java.util.ArrayList;
import java.util.List;

public class printsubsequencewhosesumisk {
     public static void printSubsets(int ind, List<Integer> ds, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (int it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println();
            }
            return;
        }

        // pick the element
        ds.add(arr[ind]);
        s += arr[ind];
        printSubsets(ind + 1, ds, s, sum, arr, n);

        // backtrack and not pick the element
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        printSubsets(ind + 1, ds, s, sum, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;

        List<Integer> ds = new ArrayList<>();
        printSubsets(0, ds, 0, sum, arr, n);
    }
}
    

