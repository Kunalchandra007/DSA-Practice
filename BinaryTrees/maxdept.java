package BinaryTrees;
import java.util.*;
public class maxdept{
     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   
    //recursive= O(height)
    //level order=O(N)

    //the ans wil be 1+maxheight(l,r)
     public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Maximum depth of tree: " + maxDepth(root));
    }
}


     