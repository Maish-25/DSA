
//here wo have to pritn the nodes on perticular level 
//consider example 
 /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
         */
    //if(input is level 3) then O/P should be 4,5,6,7,



public class PrintLevelNodes {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static void printLevelNodes(Node root,int level , int k){
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        printLevelNodes(root.left, level+1, k);
        printLevelNodes(root.right, level+1, k);
    }
        public static void main(String[] args) {
           Node root = new Node(1);
            root.left  = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            
            int k = 2;
            printLevelNodes(root, 1, k);
        }
    
}
