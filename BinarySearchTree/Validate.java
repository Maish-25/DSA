package BinarySearchTree;

public class Validate {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
          this.data = data;
          this.right = null;
          this.left = null;
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

    public static boolean validOrNotBST(Node root,Node min,Node max){
     if(root == null)return true;

     if(min != null && root.data <= min.data)return false;
     else if(max != null && root.data >= max.data)return false;

     return validOrNotBST(root.left, min, root) && validOrNotBST(root.right, root, max);
    }

    public static void main(String[] args) {
        
        int val[] = {8,5,3,6,10,11,14};
        //{1,1,1};
        Node root = null;

        for(int i =0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        if(validOrNotBST(root, null, null)){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }
        
    }
}
