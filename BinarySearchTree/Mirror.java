package BinarySearchTree;

public class Mirror {
    static class Node{
        int data;
        Node left,right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node insert(Node root,int val){
        if(root == null){
            return root = new Node(val);
        }
        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node mirrorBST(Node root){
        if(root == null)return null;

        Node lf = mirrorBST(root.left);
        Node rh = mirrorBST(root.right);

        root.left = rh;
        root.right = lf;
        return root;

    }

    public static void preOrder(Node root){
        if(root == null)return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        
        for(int i =0;i<val.length;i++){
         root = insert(root, val[i]);
        }

        preOrder(root);
        System.out.println();
        mirrorBST(root);
        preOrder(root);
    }
}
