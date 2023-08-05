import java.util.ArrayList;

public class TreeIsBST {
    boolean isBST(Node root)
    {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        for(int i=0; i<ans.size()-1; i++){
            if(ans.get(i)>=ans.get(i+1)){
                return false;
            }
        }
        return true;        
    }
    
    void inorder(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left, ans);
         ans.add(root.data);
         inorder(root.right, ans);
        
    }
}
