package ArrayList;
import java.util.*;
public class maxElement {
    public static void main(String[] args) {
        ArrayList<Integer>li = new ArrayList<>();
        li.add(1);
        li.add(8);
        li.add(3);
        li.add(10);
       int max = Integer.MIN_VALUE;
       for(int i = 0;i<li.size();i++){
            max = Math.max(li.get(i) , max);        
       }
       System.out.println(max);
    }
}
