//this is an second approach for the LCA


public class A2LowestCommonAncester{

    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Node lca2(Node root,int n1,int n2){
          if(root == null || root.data == n1 || root.data == n2){
            return root;
          }

          Node lLca = lca2(root.left, n1, n2);
          Node rLca = lca2(root.right, n1, n2);
          //lLca == valid value but rLca == null
          if(lLca == null)return rLca;
          //RLca == valid value but RLca == null
          if(rLca == null)return lLca;

          return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
            root.left  = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            
            System.out.println(lca2(root, 4, 5).data);
    }
    
}
