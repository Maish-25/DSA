package ArrayList;

import java.util.ArrayList;
//fing out if array has pair which on add gives target
public class PairSum {
    // brute force O(n^2)
    public static boolean pairSum(ArrayList<Integer> list,int target){
        for(int i = 0;i<list.size();i++){
            for(int j = 1;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    //optimized only if array or arrayList is SORTED
    public static boolean pair(ArrayList<Integer> li ,int t){
          int st = 0;
          int end = li.size()-1;
          while(st<=end){
            if(li.get(st) + li.get(end) == t){
                return true;
            }
            else if(li.get(st) + li.get(end) > t){
                end--;
            }
            else{
                st++;
            }
          }
        return false;
    }
    public static void main(String[] args){
      ArrayList<Integer> li = new ArrayList<>();
      li.add(1);
      li.add(2);
      li.add(3);
      li.add(4);
      li.add(6);
     
      if(pair(li, 79)){
        System.out.println("pair is posibble");
      }
      else{
        System.out.println("pair is not present");
      }
      
    }
}


