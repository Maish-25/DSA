package ArrayList;
import java.util.*;

public class Multidimentional {
    public static void main(String[] args){
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    //   ArrayList<Integer> li = new ArrayList<>();
    //   li.add(1);
    //   li.add(2);
    //   li.add(3);
    //   li.add(4);
    //   list.add(li);

    //   ArrayList<Integer> li2 = new ArrayList<>();
    //   li2.add(1);
    //   li2.add(2);
    //   li2.add(3);
    //   li2.add(4);
    //   list.add(li2);
    //   System.out.println(list);

      ArrayList<Integer> li1 = new ArrayList<>();
      ArrayList<Integer>li2 = new ArrayList<>();


      for(int i = 0;i<5;i++){
         li1.add(i*1);
         li2.add(i*2);
      }
  
      list.add(li1);
      list.add(li2);
      System.out.println(list);

    }
}
