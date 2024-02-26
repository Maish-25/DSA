package Recursion;

public class FirstOccurOfKey {
    public static int firstOccur(int arr[],int i,int t){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == t){
            return i;
        }
        return firstOccur(arr,i+1,t);
    }
    public static int lastOccur(int arr[] ,int i,int t){
        if(i == 0){
            return -1;
        }
        if(arr[i] == t){
            return i;
        }
        return lastOccur(arr, i-1, t);
    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,4,5,4};
        int i = arr.length-1;
        System.out.println(firstOccur(arr, 0, 4));
        System.out.println(lastOccur(arr, i, 4));
    }
}
