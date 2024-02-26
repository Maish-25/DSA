
import java.lang.reflect.Array;
import java.util.*;

public class LowestCommonAncester {

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean getpath(Node root,int n ,ArrayList<Node> path){
        if(root == null)return false;
       path.add(root);

       if(root.data == n){
        return true;
       }

       boolean foundL = getpath(root.left, n, path);
       boolean foundR = getpath(root.right, n, path);

       if(foundL || foundR ){
        return true;
       }
       path.remove(path.size()-1);
       return false;
    }
    public static Node lca(Node root, int n1 ,int n2){
        //O(n)
        //sc O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);

       //last common ancestor
       int i = 0;
       for(; i<path1.size() && i<path2.size(); i++){
        if(path1.get(i) != path2.get(i)){
            break;
        }
       }

       //last equal is  -> -1th
       Node lca = path1.get(i-1);
      return lca;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(lca(root, 2, 3).data);
    }
}
