
import java.util.*;
//Approach 1 
// TC = O(n^2)
//number of  nodes in the longest path between 4 leaves
public class DimeterOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh , rh) + 1;
    }

    public static int diameter(Node root){//O(n^2)
        if(root == null){
            return 0;
        }
       int  ldiam = diameter(root.left);
       int rdiam = diameter(root.right);
       int lh = height(root.left);
       int rh = height(root.right);
        int self = lh + rh + 1;
        return Math.max(self, Math.max(ldiam, rdiam));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left = new Node(5);
        root.right.right = new Node(6);
        System.out.println(diameter(root));
    }
}
