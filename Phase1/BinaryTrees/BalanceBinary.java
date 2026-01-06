
public class BalanceBinary {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Main function to check if the tree is balanced
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root) != -1;
    }

    // Helper function: returns height if balanced, else -1
    int dfsheight(TreeNode root) {
        if (root == null) return 0;

        int leftheight = dfsheight(root.left);
        if (leftheight == -1) return -1;

        int rightheight = dfsheight(root.right);
        if (rightheight == -1) return -1;

        if (Math.abs(leftheight - rightheight) > 1) return -1;

        return Math.max(leftheight, rightheight) + 1;
    }

    // Example usage
    public static void main(String[] args) {
        BalanceBinary tree = new BalanceBinary();

        // Build a sample balanced tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Is tree balanced? " + tree.isBalanced(root)); // ✅ true

        // Build an unbalanced tree
        TreeNode unbalanced = new TreeNode(1);
        unbalanced.left = new TreeNode(2);
        unbalanced.left.left = new TreeNode(3);

        System.out.println("Is tree balanced? " + tree.isBalanced(unbalanced)); // ❌ false
    }
}