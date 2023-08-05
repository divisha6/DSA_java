package Trees;
import java.util.ArrayList;

// /A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

// left view of binary tree ******
public class LeftView {
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      helper(root, ans, 0);
      return ans;
    }
    
    void helper(Node root, ArrayList<Integer> ans, int level){
        // ans.add(root.data);
        if(root == null) return ;
        if(ans.size()<=level) ans.add(level, root.data);
        helper(root.left, ans, level+1);
        helper(root.right, ans, level+1);
    }
}
