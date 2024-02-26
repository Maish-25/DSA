package Stack;
import java.util.*;

public class IsDuplicate {//O(n)
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int cnt = 0;
               while(s.peek() != '('){
                s.pop();
                cnt++;
               }
               if(cnt<1){
                return true;
               }
               else{
                s.pop();
               }
               
            }
            else{
                s.push(ch);
               }
        }
        return false;
    }
    public static void main(String[] args) {
      String str = "((a+b))" ;//true
      //String str1 = "((a+b) +  (b+c))"; 
      if(isDuplicate(str)){
        System.out.println("true");
      }
      else{
        System.out.println("false");
      }
    }
}
