
import java.util.*;
public class preordertraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytreee{
        static int idx=-1;
        public static Node buildTree(int node[]){
            idx++;
            if (idx >= node.length || node[idx] == -1) {
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);

            return newNode;


        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        Binarytreee tree=new Binarytreee();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preorder(root);

        }
        
    }
