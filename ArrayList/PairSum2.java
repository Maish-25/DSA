package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
   /* here the array is sorte but it is rotated at particular pivot element
    11,15,6,8,9,10 ... element 11, and 15 are rotated
    USE Two Pointer Approach
    Only while incermenting st|| end use modular properties
    % property
    case 1: st = (lp+1)%n
    case 2: end = (n+rp-1)%n
    bruteforce will be same as pairSum question O(n^2)
    */

    //optimized O(n)

    public static boolean pairSum(ArrayList<Integer> li,int t){
        int bp = -1;  
        int n = li.size();

        for(int i= 0;i<n;i++){
            if(li.get(i)>li.get(i+1)){
                bp = i;
                break;
            }
        }
        int st = bp+1;
        int end = bp;
        while(st!=end){
          if(li.get(st) + li.get(end) == t){
              return true;
          }
          else if(li.get(st) + li.get(end) > t){
              end = (n+end-1)%n;
          }
          else{
              st = (st+1)% n;
          }
        }
      return false;
    }
    public static void main(String[] args) {
      ArrayList<Integer> li = new ArrayList<>();
      //sorted and rotated arrayL
      li.add(11);
      li.add(15);
      li.add(6);
      li.add(9);
      li.add(10);
     
      if(pairSum(li, 16)){
        System.out.println("pair is posibble");
      }
      else{
        System.out.println("pair is not present");
      }
    }
}
