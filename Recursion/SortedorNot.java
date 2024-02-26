package Recursion;

public class SortedorNot {
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,9,6,7};
        if(isSorted(arr,0)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
    
}
