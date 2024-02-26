package Queue;
import java.util.*;

public class QueueReverse {
    public static void reverse(Queue<Integer> q){
        int n = q.size();
        Stack<Integer> st = new Stack<>();

        for(int  i = 0;i<n;i++){
           st.add(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
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
        reverse(q);
        print(q);
    }
}
