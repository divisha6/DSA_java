public class Prob2415 {
    public TreeNode reverseOddLevels(TreeNode root) {
        int level =0;
        travel(root.left, root.right, level+1);
        return root;
    }

    public void travel(TreeNode node1, TreeNode node2 , int level ){
        if(node1==null || node2==null) return;
        if(level%2==1){
            int temp= node1.val;
            node1.val =node2.val;
            node2.val= temp;
        }
        travel( node1.left,  node2.right, level + 1);
        travel( node1.right , node2.left, level + 1);  
    }
}
