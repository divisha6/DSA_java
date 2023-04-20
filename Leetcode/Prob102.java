import java.util.*;
public class Prob102{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> sub = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }

                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }

                sub.add(q.remove().val);
            }
            ans.add(sub);
        }
        return ans;
    }
}