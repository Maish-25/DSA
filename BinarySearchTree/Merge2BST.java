package BinarySearchTree;

import java.util.*;

public class Merge2BST {
    //Node class
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Inorder
    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null)return;

        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
     
    //createBST
    public static Node creatBST(ArrayList<Integer> arr , int st,int en){
        if(st > en){
            return null;
        }
        int mid = (st +  en) /2;
        Node root = new Node(arr.get(mid));
        root.left  = creatBST(arr, st, mid-1);
        root.right = creatBST(arr, mid+1, en);
        return root;
    }

    //Merge
    public static Node merge2BST(Node root1,Node root2){
        //step 1
       ArrayList<Integer> arr1 = new ArrayList<>();
       getInorder(root1 , arr1);

       //step2
       ArrayList<Integer> arr2 = new ArrayList<>();
       getInorder(root2, arr2);

       //merge
       ArrayList<Integer> finalA = new ArrayList<>();
       int i = 0,j = 0;
       while(i < arr1.size() && j < arr2.size()){
        if(arr1.get(i) <= arr2.get(j)){
        finalA.add(arr1.get(i));
        i++;
        }       
       else{
        finalA.add(arr2.get(j));
        j++;
       }
      }
      while(i < arr1.size()){
        finalA.add(arr1.get(i));
        i++;
      }
      while(j < arr2.size()){
        finalA.add(arr2.get(j));
        j++;
      }

      //sorted to Balace BST
      return creatBST(finalA, 0, finalA.size()-1);
    }
     
    
    public static void preOrder(Node root){
        if(root == null)return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
  /*
   *             2
   *            /  \
   *           1    4
   */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
  /*              9
                 /  \
                3    12
   * 
   */
       
   Node root = merge2BST(root1, root2);
   preOrder(root);
    }
}
