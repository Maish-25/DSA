package Stack;
import java.util.*;

public class ValidParenthesis {
    public static boolean valid(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch== '[' || ch ==  '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek() == '(' && ch == ')' || st.peek() == '[' && ch == ']' ||  st.peek() == '{' && ch == '}' ){
                    st.pop();
                }
                else{
                  return false;
                }
                 
            }
        }
        if(st.isEmpty()){return true;}
        return false;
    }
    public static void main(String[] args) {
        String str = "([]})";
        if(valid(str)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
