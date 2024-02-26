package BinarySearchTree;

public class BST{
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inOrder(Node root){
        if(root == null)return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

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
    public static void main(String[] args) {
        // int val[]= {5,1,3,4,2,7};
        int val[] = {6,5,4,3,2,1,9,8,7,10};
        Node root = null;
        for(int i = 0;i<val.length;i++){
           root =  insert(root, val[i]);
        }
        inOrder(root);

    }
}