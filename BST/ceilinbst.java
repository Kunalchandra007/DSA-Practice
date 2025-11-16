package BST;
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

public class ceilinbst {
    public static int findceil(TreeNode root,int key){
        int ceil=-1;
        while(root!=null){
            if(root.val==key){
                ceil=root.val;
                return ceil;
            }
            if(key>root.val){
                root=root.right;
            }else{
                ceil=root.val;
                root=root.left;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        int key=9;
        System.out.println(findceil(root,key));
    }

    
}
