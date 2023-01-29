public class Prob572 {
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot ==null){
            return true;
        }
        if(root==null || subRoot ==null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // when subroot is null, there will always be a match present
        if(subRoot == null){
            return true;
        }
        // if root is null, there is nothing to compare with. so false;
        if(root == null){
            return false;
        }

        if(root.val == subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
