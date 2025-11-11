import java.util.*;

// Node class for Binary Tree
class Node {
    int data;
    int hd; // horizontal distance
    Node left, right;

    Node(int data) {
        this.data = data;
        this.hd = 0;
        this.left = null;
        this.right = null;
    }
}

public class bottomview {

    // Function to return list containing the bottom view of the given tree
    public static ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Map<Integer, Integer> map = new TreeMap<>(); // stores HD -> node value
        Queue<Node> q = new LinkedList<>();

        root.hd = 0;
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.hd;

            // Update the map with the last node seen at each horizontal distance
            map.put(hd, temp.data);

            if (temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }

            if (temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }

        // Collect the bottom view nodes from left to right
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        /*
                 20
               /    \
             8       22
            / \        \
           5   3        25
              / \
             10 14
        */

        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        ArrayList<Integer> result = bottomview.bottomView(root);

        System.out.println("Bottom View of the Binary Tree:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
