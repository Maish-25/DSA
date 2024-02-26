package Stack;
import java.util.*;
public class ReverseStack {
    public static void pushatBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushatBottom(st, data);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushatBottom(st, top);
    }
    public static void print(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);      
        reverse(st);
        print(st);
    }    
}
