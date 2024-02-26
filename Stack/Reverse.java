package Stack;
import java.util.*;
public class Reverse {
    public static String reverse(String str){
         Stack<Character> ch = new Stack<>();
         int idx =0;
         while(idx < str.length()){
            ch.push(str.charAt(idx));
            idx++;
         }
         StringBuilder res = new StringBuilder("");

          while(!ch.isEmpty()){
            res.append(ch.pop());
          }
          return res.toString();
    }
    public static void main(String[] args) {
        String str = "manish";
        System.out.println(reverse(str));
    }
}
