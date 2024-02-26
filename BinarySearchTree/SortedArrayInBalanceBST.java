package BinarySearchTree;

public class SortedArrayInBalanceBST {
    static class Node{
        int data;
        Node right,left;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root){
        if(root == null)return;
        
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root == null)return;
        
       
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static Node createBalanceBST(int arr[],int st,int en){
       if(st > en)return null;
       int mid = (st+ en) / 2;
       Node root = new Node(arr[mid]);
       root.left = createBalanceBST(arr, st, mid-1);
       root.right = createBalanceBST(arr, mid+1, en);
       return root;
    }
    public static void main(String[] args) {
        int val[] = {3,5,6,8,10,11,12};
        //{1,1,1};
        Node root = createBalanceBST(val, 0, val.length-1);

        preOrder(root);
        System.out.println();
        inOrder(root);
    }
}
