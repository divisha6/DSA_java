import java.util.*;

public class BinaryTreeYT{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // PREORDER
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // INORDER- time complexuty O(n)
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // POSTORDER- time complexity O(n)
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    // COUNT OF NODES- time complexity O(n)
    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
         int leftnodes = countOfNodes(root.left);
         int rightnodes = countOfNodes(root.right);
         return leftnodes + rightnodes + 1;    
    }

    // SUM OF NODES- time complexity O(n)
    public static int sumOfNodes(Node root ) {
        if(root==null){
            return 0;
        }
         int leftSum = sumOfNodes(root.left);
         int rightSum = sumOfNodes(root.right);
         return leftSum + rightSum + root.data;           
    }

    // HEIGHT OF THE TREE - time O(n)
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight =height( root.left);
        int rightHeight =height( root.right);
        int maxHeight = Math.max(leftHeight, rightHeight) +1;
        return maxHeight;
    }

    // DIAMETER- time O(n^2)- quadratic complexity
    public static int diameter1(Node root) {
        if(root==null){
            return 0;
        }
        int diam1 = diameter1(root.left);
        int diam2 = diameter1(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
         return Math.max(diam2, Math.max(diam1, diam3));   
    }

    // class to store height and diameter at all stages
    static class TreeInfo{
        int height;
        int diam;

        TreeInfo(int ht, int diam){
            this.height = height;
            this.diam= diam;
        }
    }
    // DIAMETER- time O(n) - linear time complexity (wrong ans de raha hai)
    public static TreeInfo diameter(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);
        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;
        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;
        int myDiam = Math.max(diam1, Math.max(diam2, diam3));
        return new TreeInfo(myHeight, myDiam);
    }
 


    public static void main(String[] args) {
        int nodes[] = {78,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root= tree.buildTree(nodes);
        // System.out.println(root.data);
        // System.out.print("Preorder is ");
        // preorder(root);
        // System.out.print("Inorder is ");
        // inorder(root);
        // System.out.print("Postorder is ");
        // postorder(root);
        // System.out.println("Levelorder is:");
        // levelorder(root);
        // System.out.print("Total number of nodes are ");
        // System.out.println(sumOfNodes(root));
        // System.out.println(height(root));
        System.out.println(diameter(root).diam);

    }
}