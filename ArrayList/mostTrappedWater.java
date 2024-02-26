package ArrayList;
import java.util.*;
public class mostTrappedWater {
    public static int trapped(ArrayList<Integer> li){
        // int maxWater = 0;
        // //brute force O(n^2);
        // for(int i = 0;i<li.size();i++){
        //     for(int j = i+1;j<li.size();j++){
        //         int ht = Math.min(li.get(i),li.get(j));
        //         int width = j-i;
        //         int ans = width* ht;
        //         maxWater = Math.max(maxWater,ans);
        //     }
        // }
        // return maxWater;

        //two pointer approach
        int start = 0;
        int end = li.size()-1;
        int maxWater = 0;
        while(start<= end){
            int ht = Math.min(li.get(start) , li.get(end));
            int width = end- start;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            if(li.get(start) < li.get(end)){
                start++;
            }
            else{
                end--;
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(8);
        li.add(6);
        li.add(2);
        li.add(5);
        li.add(4);
        li.add(8);
        li.add(3);
        li.add(7);
        System.out.println(trapped(li));
    }
}
