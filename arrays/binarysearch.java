package arrays;

import java.util.Arrays;

public class binarysearch {
    public static int Binarysearch(int arr[], int key) {
        Arrays.sort(arr);  // sort the entire array
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {23, 44, 55, 66, 77, 6, 7};
        int index = Binarysearch(arr, 6);
        System.out.println("Index of key: " + index);
    }
}
