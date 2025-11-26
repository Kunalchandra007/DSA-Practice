import java.util.*;

public class rotatearrrbyd{

    // Function to left rotate array by d positions
    public static void leftRotate(int[] arr, int n, int d) {
        d = d % n; // In case d > n
        
        int[] temp = new int[d];

        // Store first d elements in temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Put back temp[] elements at end
        for (int i = n - d, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter d for left rotation: ");
        int d = sc.nextInt();

        leftRotate(arr, n, d);

        System.out.println("Array after left rotation:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
//for leetcode (as oer right rotation)
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n; // handle k > n

//         // Right rotation by k = Left rotation by (n - k)
//         int d = n - k;

//         int[] temp = new int[d];

//         // Step 1: Store first d elements in temp
//         for (int i = 0; i < d; i++) {
//             temp[i] = nums[i];
//         }

//         // Step 2: Shift the remaining elements to the left
//         for (int i = d; i < n; i++) {
//             nums[i - d] = nums[i];
//         }

//         // Step 3: Place temp elements at the end
//         for (int i = n - d, j = 0; i < n; i++, j++) {
//             nums[i] = temp[j];
//         }
//     }
// }
