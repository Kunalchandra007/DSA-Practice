package Recursion;
import java.util.*;
public class printallsubsequence {
    // This function prints all subsequences of arr[]
    static void printSubsequences(int ind, List<Integer> ds, int arr[], int n) {
        if (ind == n) {
            if (ds.size() == 0) {
                System.out.print("{}");
            } else {
                for (int it : ds) {
                    System.out.print(it + " ");
                }
            }
            System.out.println();
            return;
        }
 
        // Not pick or do not take condition: current element is not chosen
        printSubsequences(ind + 1, ds, arr, n);

        // Take or pick condition: include current index in the subsequence
        ds.add(arr[ind]);
        printSubsequences(ind + 1, ds, arr, n);
        ds.remove(ds.size() - 1); // Backtrack
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        int n = arr.length;
        List<Integer> ds = new ArrayList<>();
        printSubsequences(0, ds, arr, n);
    }
}


    

