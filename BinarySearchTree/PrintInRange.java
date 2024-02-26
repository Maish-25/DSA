package BinarySearchTree;

import Recursion.printNumberInc;

public class PrintInRange {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
          this.data = data;
          this.right = null;
          this.left = null;
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

    public static void printInRange(Node root,int k1,int k2){
        if(root == null)return ;
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
           printInRange(root.right, k1, k2);
        }
    }
  

    public static void main(String[] args) {
        int val[] = {5,7,3,4,8,9};
        Node root = null;

        for(int i = 0;i<val.length;i++){
            root = insert(root,val[i]);
        }
        inOrder(root);
        System.out.println();

        printInRange(root, 1, 5);
        
    }
}
