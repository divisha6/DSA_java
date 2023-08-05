package Trees;

public class HeightOfBST {
    int height(Node node) 
    {
        // code here 
        if(node==null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
    }
}
