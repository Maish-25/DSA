package BinarySearchTree;

public class SearchBST {
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
    public static boolean searchNode(Node root, int key){
        if(root == null)return false;
        if(root.data == key)return true;

        if(root.data > key){
            return searchNode(root.left, key );
        }
        if(root.data > key)return searchNode(root.left, key);
        else{
            return searchNode(root.right, key);
        }
      }

    public static void main(String[] args) {
        int val[] = {5,7,3,4,8,9};
        Node root = null;

        for(int i = 0;i<val.length;i++){
            root = insert(root,val[i]);
        }
        inOrder(root);
        if(searchNode(root, 4)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
