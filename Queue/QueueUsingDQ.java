package Queue;
import java.util.*;
public class QueueUsingDQ {
    static class Queue{
        Deque<Integer> dq = new LinkedList<>(); 
        //add
        public void add(int n){
            dq.addLast(n);
        }
        //remove
        public int remove(){
           return dq.removeFirst();
        }
        //get
        public int peek(){
            return dq.getFirst();
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}
