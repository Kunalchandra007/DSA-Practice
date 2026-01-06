/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class checkforidenticaltrees {
    // Function to check if two trees are identical
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return (p == q);
        }

        return (p.val == q.val)
            && isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Create first binary tree
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        // Create second binary tree
        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        // Create object of class
        checkforidenticaltrees obj = new checkforidenticaltrees();

        // Check if both trees are identical
        boolean result = obj.isSameTree(tree1, tree2);

        // Print the result
        if (result) {
            System.out.println("Both trees are identical ✅");
        } else {
            System.out.println("Trees are NOT identical ❌");
        }
    }
}
