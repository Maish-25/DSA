package BinarySearchTree;

public class DeleteNode {
    static class Node{
        int data;
        Node left,right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   public static void inOrder(Node root) {
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

    public static Node deleteNode(Node root,int data){
        if(root.data < data){
            root.right = deleteNode(root.right, data);
        }
        else if (root.data > data) {
            root.left = deleteNode(root.left, data);    
        }
        
        else{
            //case 1 -left node
            if(root.left == null && root.right == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3 - both child
            Node IS = findInorderSucessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSucessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
       int val[] = {8,5,3,1,4,6,10,11,14};
       Node root = null;
       
       for(int i =0;i<val.length;i++){
        root = insert(root, val[i]);
       }
       inOrder(root);
       System.out.println();
    //test input 1 for case 1
    //    root= deleteNode(root, 1);
    // input 10 for case 2
    // root= deleteNode(root, 10);
   //input 5 for case 3
   root = deleteNode(root, 5);
       System.out.println();
       inOrder(root);
     }
}



//input 5 for case 3