import java.util.*;
//O(n)
public class BinaryTree {
    static class Node{
        Node right ;
        Node left;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class  BinaryTre {
      static int idx = -1;
      public  Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
      }   
      
       //traversal technique
       //preorder traversal
       //O(n)
      public static void preorder(Node root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
      }
      
      //Inorder traversal
      //O(n)
      public static void Inorder(Node root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
      }

      //post order
      //o(n)
      public static void postorder(Node root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
      }

      //level order
      //
      public static void levelOrder(Node root){
        if(root == null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print (currNode.data + " ");
                if(currNode.left != null){
                q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
                
            }
        }
      }
    }
   
   
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTre tree = new BinaryTre();
        Node root = tree.buildTree(nodes);
        //tree.preorder(root);
       // tree.Inorder(root);
       // tree.postorder(root);
       tree.levelOrder(root);
        // System.out.println(root.data);
    }
}
