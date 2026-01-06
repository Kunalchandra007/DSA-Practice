package BST;
// Node definition
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class BSTminmax {

    // Find minimum value in BST
    public static int findMin(TreeNode root) {
        if (root == null) return -1; 

        while (root.left != null) {
            root = root.left;   
        }
        return root.val;
    }

    
    public static int findMax(TreeNode root) {
        if (root == null) return -1; 

        while (root.right != null) {
            root = root.right;  
        }
        return root.val;
    }

    public static void main(String[] args) {

        /* Example BST:
                    8
                   / \
                  3   10
                 / \    \
                1   6    14
        */

        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);

        System.out.println("Min = " + findMin(root));
        System.out.println("Max = " + findMax(root));
    }
}

