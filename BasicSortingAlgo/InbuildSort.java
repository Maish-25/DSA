package BasicSortingAlgo;
import java.util.*;

import java.util.Arrays;
import java.util.Collections;

public class InbuildSort {

    public static void print(Integer[] arr,Integer n){
        for(Integer i = 0;i<n;i++){
         System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {2,5,3,1,6,4,9,8,7};
        Integer si = 0;
        Integer ei = 4;
        Integer n= arr.length;
        print(arr, n);
        Arrays.sort(arr,si,ei);
        print(arr, n);
        Arrays.sort(arr);
        print(arr, n);
        //for revdrver to be implemented using collection weh've to made int-> Integer
        //as reverse order works only on objects not on primitive datatypes
        Arrays.sort(arr, Collections.reverseOrder());
        print(arr, n);
    }
}
