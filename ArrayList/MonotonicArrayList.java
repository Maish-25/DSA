package ArrayList;

import java.util.ArrayList;

/*An Arraylist is monotonic 
if it is either monotone increasing or 
monotone decreasing. An Array listnums is monotone
increasing if for all i<=j,nums.get(i)<=nums.get(j).AnArraylist
 nums is monotone decreasing if for all i <= j, 
 nums.get(i) >= nums.get(j). */
public class MonotonicArrayList {

    public static boolean monotonic(ArrayList<Integer> li){
        boolean inc = true;
        boolean dec = false;
       for(int i = 0;i<li.size()-1;i++){
        if(li.get(i) > li.get(i+1)){
            inc = false;
        }
        else if(li.get(i) < li.get(i+1)){
            dec = false;
        }
       }
       return inc || false;
    }

    public static void main(String[] args) {
      ArrayList<Integer> li = new ArrayList<>();
      li.add(1);
      li.add(2);
      li.add(2);
      li.add(3);
    //   li.add(6);
     
      if(monotonic(li)){
        System.out.println("true");
      }
      else{
        System.out.println("false");
      }
    }   

}
