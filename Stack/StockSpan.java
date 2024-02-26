package Stack;
import java.util.*;

public class StockSpan {
    public static void stockSpan(int stock[],int span[]){
         Stack<Integer> st = new Stack<>();
         span[0] = 1;

         for(int i = 0;i< stock.length;i++){
            int curr = stock[i];
            while(!st.isEmpty() && curr > stock[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh = st.peek();
                span[i] = i - prevHigh;
            }

            st.push(i);
         }

    }
    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int [stock.length];
        stockSpan(stock,span);

        for(int i = 0;i<span.length;i++){
            System.out.println(span[i]+ " ");
        }
    }
}
