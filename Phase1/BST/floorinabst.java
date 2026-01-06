package BST;
import java.util.*;
import javax.swing.tree.TreeCellRenderer;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.right=right;
        this.left=left;

    }

}
public class floorinabst {
    public static int flooinbst(TreeNode root,int key){
        int floor=-1;
        while(root!=null){
            if(root.val==key){
                floor=root.val;
                return floor;

            }
            if(key>root.val){
                floor=root.val;
                root=root.right;
            }
            else{
                root=root.left;
            }

        }
        return floor;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(15);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(8);
        root.left.right.left=new TreeNode(6);
        int key=7;
        System.out.println(flooinbst(root,key));


        }
    }
    

