package Greedy;
import java.util.*;

/**
 * ActivitySelection
 *you are give n activities with their start and end
  select max num if activitied that can be performed by a single person 
 assuming that a person can work on a single activity at a time
 */

//O(nlogN)
public class ActivitySelection {
    //if(the end array is not sorted){use this function}
    public static void activityselection(int[] start , int[] end){
        //sorting
        int activity[][] = new int[start.length][3];
        for(int i = 0;i<start.length;i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }
        //lambda function for the sorting of 2D Array -> sortform
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        //end  time basis sorted
        int maxAct = 0;
        ArrayList<Integer>li = new ArrayList<>();

        //1st activity
        maxAct  = 1;
        li.add(activity[0][0]);
        int lastEnd = activity[0][2];
        for(int i = 1;i<end.length;i++){
           if(start[i] >= lastEnd){
            //activity selection
            maxAct++;
            li.add(i);
            lastEnd  = end[i];
           }
        }
        System.out.print(maxAct);
        for(int i = 0;i<li.size();i++){
            System.out.print("A" + li.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int[] start = {10,12,20};
        int[] end ={20,25,30};
        activityselection(start, end);

        //O(n) but not wok for unsorted
        // ArrayList<Integer> li  = new ArrayList<>();
        // //ans = 2(A0 & A2)
        // int maxAct = 1;
        // li.add(0);
        // int lastEnd = end[0];
        //  for(int i = 1;i<end.length;i++){
        //     if(start[i] >= lastEnd){
        //         maxAct++;
        //         li.add(i);
        //         lastEnd = end[i];
        //     }
        //  }

        //  System.out.println(maxAct);
        //  for(int i = 0;i<li.size();i++){
        //     System.out.print("A"+ li.get(i));
        //  }
    }
}
