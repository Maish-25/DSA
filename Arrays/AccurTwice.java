package Arrays;
import java.util.*;
public class AccurTwice {
    public static boolean twiceAccur(int[] arr,int n){
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
               if(arr[i] == arr[j]){
                 return true;
               }
            }
        }
        return false;
    }

    public static boolean twiceAccuringSet(int arr[] , int n){
        HashSet<Integer> li = new HashSet<>();
        for(int i = 0;i<n;i++){
            if(li.contains(arr[i])){
                return true;
            }
            else{
                li.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,1,9,7};
        int n = arr.length;
        // if(twiceAccur(arr,n)){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }
        if(twiceAccuringSet(arr,n)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
