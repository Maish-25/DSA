package ArrayList;
import java.util.*;

import java.util.ArrayList;

public class swapElement {
    public static void main(String[] args) {
       ArrayList<Integer> li = new ArrayList<>();
       li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(6);
        int idx1 = 1,idx2 = 3;
        int temp = li.get(idx1);
        li.set(idx1,li.get(idx2));
        li.set(idx2, temp);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        Collections.sort(li, Collections.reverseOrder());
    System.out.println(li);
}
}