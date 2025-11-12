import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class rightandleftview {

    // Function to get right side view
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightView(root, result, 0);
        return result;
    }

    private void rightView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null) return;

        // If this is the first node of its level
        if (currDepth == result.size()) {
            result.add(curr.val);
        }

        // Go right first to capture rightmost nodes
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
    }

    // Function to get left side view
    public List<Integer> leftSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        leftView(root, result, 0);
        return result;
    }

    private void leftView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null) return;

        if (currDepth == result.size()) {
            result.add(curr.val);
        }

        // Go left first to capture leftmost nodes
        leftView(curr.left, result, currDepth + 1);
        leftView(curr.right, result, currDepth + 1);
    }

    // Main function to test both views
    public static void main(String[] args) {
        // Build a sample tree
        /*
                   1
                 /   \
                2     3
               / \     \
              4   5     6
                     \
                      7
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        rightandleftview obj = new rightandleftview();

        List<Integer> rightView = obj.rightSideView(root);
        List<Integer> leftView = obj.leftSideView(root);

        System.out.println("Right Side View: " + rightView);
        System.out.println("Left Side View: " + leftView);
    }
}
