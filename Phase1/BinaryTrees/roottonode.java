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

public class roottonode {

    private boolean getPath(TreeNode root, ArrayList<Integer> arr, int x) {
        if (root == null) {
            return false;
        }

        arr.add(root.val);  // include current node

        // If this is the target
        if (root.val == x) {
            return true;
        }

        // Explore left or right subtree
        if (getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
            return true;
        }

        // Backtrack if not found
        arr.remove(arr.size() - 1);
        return false;
    }

    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (A == null) return arr;

        getPath(A, arr, B);
        return arr;
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

        roottonode r = new roottonode();
        System.out.println(r.solve(root, 7)); // example: path from root to 7
    }
}
