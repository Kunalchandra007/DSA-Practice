class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    // Global variable to store max path sum
    int maxSum = Integer.MIN_VALUE;

    // Main function
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    // DFS recursive function
    private int dfs(TreeNode node) {
        if (node == null) return 0;

        // Calculate left and right subtree max path
        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        // Update max sum considering current node
        maxSum = Math.max(
            maxSum,
            left + right + node.val
        );

        // Return one-sided path
        return Math.max(left, right) + node.val;
    }
}

public class minshortestpath {
    public static void main(String[] args) {
        // Creating test tree
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        System.out.println(
            "Maximum Path Sum: " +
            sol.maxPathSum(root)
        );
    }
}