package Recursion;

public class countallsubswithsumk {
    
public static int countSubsets(int ind, int s, int sum, int[] arr, int n) {
        // Optimization: if all elements are positive
        if (s > sum) return 0;

        // Base case
        if (ind == n) {
            return (s == sum) ? 1 : 0;
        }

        // Pick the element
        s += arr[ind];
        int left = countSubsets(ind + 1, s, sum, arr, n);
        s -= arr[ind]; // backtrack

        // Not pick the element
        int right = countSubsets(ind + 1, s, sum, arr, n);

        return left + right;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int sum = 2;

        int result = countSubsets(0, 0, sum, arr, n);
        System.out.println("Number of subsets with sum " + sum + " is: " + result);
    }
}
