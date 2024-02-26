package Queue;
import java.util.*;

public class BuileInQueue {
    public static void main(String[] args) {
        //O(1) for all operation
        Queue<Integer> q = new LinkedList<>();
         //ArrayDeque
        //Queue<Integer> dq = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
