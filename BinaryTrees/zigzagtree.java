import java.util.*;

import javax.swing.tree.TreeNode;
import java.util.*;  // Import List, ArrayList, Queue, LinkedList, Arrays

public class zigzagtree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.offer(root);
        boolean leftToRight = true;

        while (!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();
            Integer[] row = new Integer[size];

            for (int i = 0; i < size; i++) {
                TreeNode node = nodesQueue.poll();

                // find correct index for zigzag order
                int index = leftToRight ? i : (size - 1 - i);
                row[index] = node.val;

                if (node.left != null) nodesQueue.offer(node.left);
                if (node.right != null) nodesQueue.offer(node.right);
            }

            result.add(Arrays.asList(row));
            leftToRight = !leftToRight; // flip direction
        }

        return result;
    }

    public static void main(String[] args) {
        zigzagtree tree = new zigzagtree();

        // Build example tree:
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Perform zigzag traversal
        List<List<Integer>> result = tree.zigzagLevelOrder(root);

        // Print result
        System.out.println("Zigzag Level Order Traversal:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}

//for leetcode
// import java.util.*;

// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         if (root == null) return result;

//         Queue<TreeNode> nodesQueue = new LinkedList<>();
//         nodesQueue.offer(root);
//         boolean leftToRight = true;

//         while (!nodesQueue.isEmpty()) {
//             int size = nodesQueue.size();
//             Integer[] row = new Integer[size];

//             for (int i = 0; i < size; i++) {
//                 TreeNode node = nodesQueue.poll();

//                 int index = leftToRight ? i : (size - 1 - i);
//                 row[index] = node.val;

//                 if (node.left != null) nodesQueue.offer(node.left);
//                 if (node.right != null) nodesQueue.offer(node.right);
//             }

//             result.add(Arrays.asList(row));
//             leftToRight = !leftToRight;
//         }

//         return result;
//     }
// }

// // Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }
