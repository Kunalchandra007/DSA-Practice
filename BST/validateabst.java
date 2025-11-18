package BST;

import javax.security.auth.callback.TextInputCallback;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class validateabst {
    public static  boolean isvalidate(TreeNode root){
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static  boolean isValidBST(TreeNode root, long minval,long maxval){
        if(root==null)return true;
        if(root.val>=maxval || root.val<=minval){
            return false;
        }
        return isValidBST(root.left, minval,root.val) && isValidBST(root.right, root.val, maxval);

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(13);
        root.left=new TreeNode(10);
        root.left.right=new TreeNode(12);
        root.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(9);
        root.left.left.right.left=new TreeNode(8);
        root.right=new TreeNode(15);
        root.right.left=new TreeNode(14);
        root.right.right=new TreeNode(17);
        root.right.right.left=new TreeNode(16);

        System.out.println(isvalidate(root));
    }
}
