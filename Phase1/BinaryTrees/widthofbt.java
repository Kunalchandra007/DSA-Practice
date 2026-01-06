import java.util.*;

// Node of binary tree
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

// Pair storing (node, index)
class Pair {
    TreeNode node;
    int num;
    Pair(TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class widthofbt {

    // Function to compute width of binary tree
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int mmn = q.peek().num;     // minimum index of this level
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                int cur_id = q.peek().num - mmn; // normalize index
                TreeNode node = q.peek().node;
                q.poll();

                if (i == 0) first = cur_id;
                if (i == size - 1) last = cur_id;

                if (node.left != null)
                    q.offer(new Pair(node.left, cur_id * 2 + 1));

                if (node.right != null)
                    q.offer(new Pair(node.right, cur_id * 2 + 2));
            }

            ans = Math.max(ans, last - first + 1);
        }

        return ans;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        /*
                 1
               /   \
              3     2
             / \     \
            5   3     9

            Width of last level = index(9) - index(5) + 1 = 4
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(9);

        widthofbt obj = new widthofbt();
        System.out.println("Maximum Width = " + obj.widthOfBinaryTree(root));
    }
}
