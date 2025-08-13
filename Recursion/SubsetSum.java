package Recursion;
import java.util.*;
public class SubsetSum {
    void func(int ind,int sum,ArrayList<Integer>arr,int N,ArrayList<Integer>sumSubset){
        if(ind==N){
            sumSubset.add(sum);
            return;
        }
              func(ind + 1, sum + arr.get(ind), arr, N, sumSubset);
        func(ind + 1, sum, arr, N, sumSubset);
    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    public static void main(String[] args) {
        SubsetSum sol = new SubsetSum();

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, 2));
        ArrayList<Integer> result = sol.subsetSums(arr, arr.size());

        System.out.println("Subset sums: " + result);
    }
}
    
