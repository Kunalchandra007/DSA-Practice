package BST;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class kthsmallest {

    private int count = 0;
    private int answer = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return answer;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        inorder(node.left, k);

        count++;
        if (count == k) {
            answer = node.val;
            return;
        }

        inorder(node.right, k);
    }

    // Utility function to insert nodes in BST
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        // Create a BST
        int[] values = {5, 3, 6, 2, 4, 1};
        TreeNode root = null;
        for (int v : values) root = insert(root, v);

        kthsmallest obj = new kthsmallest();
        int k = 3;  

        System.out.println("Kth smallest element: " + obj.kthSmallest(root, k));
    }
}
// private void reverseInorder(TreeNode node, int[] counter, int k, int[] kLargest) {
//         if (node == null || counter[0] >= k) return;

//         // Traverse right subtree
//         reverseInorder(node.right, counter, k, kLargest);

//         // Increment counter after
//         // visiting right subtree
//         counter[0]++;

//         // Check if current node
//         // is the Kth largest
//         if (counter[0] == k) {
//             kLargest[0] = node.val;
//             return;
//         }

//         // Traverse left subtree if
//         // Kth largest is not found yet
//         reverseInorder(node.left, counter, k, kLargest);
//     }
 

//leetcode 
//  private int count=0;
//     private int result=0;
//     public int kthSmallest(TreeNode root, int k) {
//         inorder(root,k);
//         return result;
//     }
//     private void inorder(TreeNode node,int k){
//         if(node==null)return;
//         inorder(node.left,k);
//         count++;
//         if(count==k){
//             result=node.val;
//             return;
//         }
//         inorder(node.right,k);
//     }
// }