package Greedy;
import java.security.DrbgParameters.Capability;
import java.util.*;

public class FactionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w =50;
        double ratio[][] = new double[val.length][2];
        //0th col => idx; 1 col => ratio

        for(int i = 0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1]= val[i] / (double) weight[i];
        }
        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
       // but we want it in descending 
       int capacity = w;
       int finalvalue = 0;
       for(int i = ratio.length-1;i >= 0 ;i--){
        int idx = (int)ratio[i][0];
        if(capacity >= weight[idx]){
            finalvalue += val[idx];
            capacity -= weight[idx];
        }
        else{
            //include fractional  item
            finalvalue += (ratio[i][1] * capacity);
            capacity = 0;
            break;
        }
       }
       System.out.println(finalvalue);

    }
}
