import java.util.*;
public class HeightOfTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(3);
        root.right=new TreeNode(4);
        root.right.right=new TreeNode(100);
        System.out.println(height(root));

    }
    public static int height(TreeNode root){
        if (root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }
}
