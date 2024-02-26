package ArrayList;
import java.util.*;

public class printReverse {
    public static void main(String[] args) {
       ArrayList<Integer> li = new ArrayList<>();
       li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        for(int i= li.size()-1;i>=0;i--){
            System.out.print(li.get(i) + " ");
        }
        System.out.println();
    }
}
