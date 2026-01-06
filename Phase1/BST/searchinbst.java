package BST;
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

public class searchinbst {
    public static TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(9);
         root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        int target = 6;

        // Calling without creating an object
        TreeNode result =searchBST(root, target);

        if (result != null) {
            System.out.println("Value " + target + " found");
        } else {
            System.out.println("Value " + target + " not found");
        }
    }

    }
