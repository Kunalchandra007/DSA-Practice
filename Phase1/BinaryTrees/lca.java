import java.util.*;

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

public class lca {
    public static TreeNode lowestca(TreeNode root, TreeNode p, TreeNode q) {
        // base case
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestca(root.left, p, q);
        TreeNode right = lowestca(root.right, p, q);

        if (left == null) return right;
        if (right == null) return left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;              // 5
        TreeNode q = root.left.right.right;  // 4

        TreeNode ans = lca.lowestca(root, p, q);
        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + ans.val);
    }
}
//without static 
// import java.util.*;

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

// public class lca {
//     public TreeNode lowestca(TreeNode root, TreeNode p, TreeNode q) {
//         // base case
//         if (root == null || root == p || root == q) {
//             return root;
//         }
//         TreeNode left = lowestca(root.left, p, q);
//         TreeNode right = lowestca(root.right, p, q);

//         if (left == null) {
//             return right;
//         } else if (right == null) {
//             return left;
//         } else {
//             return root;
//         }
//     }

//     public static void main(String[] args) {
//         // Constructing the binary tree
//         /*
//                  3
//                 / \
//                5   1
//               / \ / \
//              6  2 0  8
//                / \
//               7   4
//         */

//         TreeNode root = new TreeNode(3);
//         root.left = new TreeNode(5);
//         root.right = new TreeNode(1);
//         root.left.left = new TreeNode(6);
//         root.left.right = new TreeNode(2);
//         root.right.left = new TreeNode(0);
//         root.right.right = new TreeNode(8);
//         root.left.right.left = new TreeNode(7);
//         root.left.right.right = new TreeNode(4);

//         lca obj = new lca();

//         TreeNode p = root.left;              // Node with value 5
//         TreeNode q = root.left.right.right;  // Node with value 4

//         TreeNode ans = obj.lowestca(root, p, q);

//         if (ans != null) {
//             System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + ans.val);
//         } else {
//             System.out.println("No common ancestor found.");
//         }
//     }
// }
