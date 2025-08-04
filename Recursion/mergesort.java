package Recursion;
import java.util.*;

public class mergesort {
     public static void merge(List<Integer> arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr.set(i, temp.get(i - low));
        }
    }

    public static void mS(List<Integer> arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void mergeSort(List<Integer> arr, int n) {
        mS(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(10, 8, 2, 6, 9, 3, 5, 4));
        int n = arr.size();
        mergeSort(arr, n);
        System.out.println("Sorted array: " + arr);
    }
    
}
