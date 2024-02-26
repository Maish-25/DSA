package Greedy;
import java.util.*;
//here we have given with 2 array task is to find min absolute diffrence

public class SumofAbsoluteDifference {
    public static void main(String[] args){
       int[] A = {1,2,3};
       int[] B = {2,1,3};
       //for t case A= 4,1,8,7,   B= {2,3,6,5) O/P = 6
       Arrays.sort(A);
       Arrays.sort(B);

       int minDiff = 0;

       for(int i =0;i<A.length;i++){
        minDiff += Math.abs(A[i] - B[i]);
       }
       System.out.println(minDiff);
    }
    }

