package Queue;
import java.util.*;
//que element have to be inter place 
//let q is 1,2,3,4,5,6,7,8,9
//O/p q = 1,6,2,7,3,8,4,9,5,10

public class Interleave2Halves {
    public static Queue<Integer> interLeave(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        int n = q.size();
        for(int i = 0;i<n/2;i++){
            q1.add(q.remove());
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
        return q;
     }
     public static void print(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
     }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        print(q);
    }
}
