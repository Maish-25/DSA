package Stack;
import java.util.*;

//O(n)recursion
public class PushatBottom {
    public static void pushBotttom(Stack<Integer>st , int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushBotttom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        pushBotttom(st, 4);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        
        }

    }
}
