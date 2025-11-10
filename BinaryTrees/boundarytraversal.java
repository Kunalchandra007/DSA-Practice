import java.util.*;

public class boundarytraversal {

    // Definition for a binary tree node
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Utility function to check if a node is a leaf
    static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    // Add the left boundary (excluding leaf nodes)
    static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.left;
        while (cur != null) {
            if (!isLeaf(cur)) res.add(cur.data);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }

    // Add the right boundary (excluding leaf nodes, reversed)
    static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.right;
        ArrayList<Integer> tmp = new ArrayList<>();
        while (cur != null) {
            if (!isLeaf(cur)) tmp.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        // Add in reverse order
        for (int i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }

    // Add all leaf nodes
    static void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }

    // Main function to perform boundary traversal
    static ArrayList<Integer> printBoundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) return ans;

        if (!isLeaf(node)) ans.add(node.data); // Add root (if not a leaf)

        addLeftBoundary(node, ans); // Step 1: Left boundary
        addLeaves(node, ans);       // Step 2: Leaf nodes
        addRightBoundary(node, ans);// Step 3: Right boundary (reversed)

        return ans;
    }

    // Main method
    public static void main(String[] args) {
        // Create a sample binary tree
        /*
                1
               / \
              2   3
             / \   \
            4   5   7
               / \
              8   9
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.right = new Node(7);

        // Perform boundary traversal
        ArrayList<Integer> result = printBoundary(root);

        // Print result
        System.out.println("Boundary Traversal of the tree is:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
