public class BST{
    // creating node 
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root , int val) {
        if(root == null){
            root.data= val;
            return root;
        }

        if(root.data > val){
            root.left= insert(root.left, val);
        }
        else{
            root.right= insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values= {8,5,4,9};
        // initialising root with null value
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
       }
       inorder(root);
       System.out.println();
    }
}