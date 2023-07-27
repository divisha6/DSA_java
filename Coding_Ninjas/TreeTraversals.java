package Coding_Ninjas;
import java.util.* ;
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/


class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
}

public class TreeTraversals 
 {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> in = new ArrayList<>();
		List<Integer> pre = new ArrayList<>();
		List<Integer> post = new ArrayList<>();
		inOrderTraversal(in, root);
		preOrderTraversal(pre, root);
		postOrderTraversal(post, root);
		res.add(in); res.add(pre); res.add(post);
		return res;
    }

	public static void inOrderTraversal(List<Integer> ans , BinaryTreeNode<Integer> root){
		if(root==null) return ;
		inOrderTraversal(ans, root.left);
		ans.add(root.data);
		inOrderTraversal(ans, root.right);
	}

	public static void preOrderTraversal(List<Integer> ans , BinaryTreeNode<Integer> root){
		if(root==null) return ;
		ans.add(root.data);
		preOrderTraversal(ans, root.left);
		preOrderTraversal(ans, root.right);
	}

	public static void postOrderTraversal(List<Integer> ans , BinaryTreeNode<Integer> root){
		if(root==null) return ;
		postOrderTraversal(ans, root.left);
		postOrderTraversal(ans, root.right);
		ans.add(root.data);
	}

}
