package Queue;
import java.util.*;

public class StackusingDEQUE {
    static class Stack{
       Deque<Integer> dq = new LinkedList<>();
       //push
       public void push(int n){
         dq.addLast(n);
       }
       //pop
       public int pop(){
        return dq.removeLast();
       }
       //peek
       public int peek(){
        return dq.getLast();
       }
    }
   
    public static void main(String[] args) {
       Stack st = new Stack();
       st.push(3);
       System.out.println(st.peek());
       System.out.println(st.pop());
    }
}
