public class Prob104 {
    public int maxDepth(TreeNode root) {
        return height(root);
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        int depth = Math.max(leftHt , rightHt)+1;
        return depth;
    }
}
