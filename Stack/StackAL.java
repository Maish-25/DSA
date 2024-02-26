package Stack;
import java.util.*;

public class StackAL {
    static class Stack{
        static ArrayList<Integer> li  = new ArrayList<>();

        //isEmpty
        public static boolean isEmpty(){
            return li.size() == 0;
        }
        //push
        public static void push(int n){
            li.add(n);
        }
        public static int peek(){
            int top = li.get(li.size()-1);
            return top;
        }
        //pop
        public static int pop(){
            int top = li.get(li.size() - 1);
            li.remove(li.size()-1);
            return top;
        }

    }
    public static void main(String[] args) {
        Stack  st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pop();
        st.peek();
        while( !st.isEmpty()){
            System.out.println(st.peek() + " ");
            st.pop();
        }

    }
    
}
