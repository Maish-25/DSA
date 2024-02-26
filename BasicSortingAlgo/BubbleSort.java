package BasicSortingAlgo;

public class BubbleSort {
    public static void print(int[] arr,int n){
        for(int i = 0;i<n;i++){
         System.out.print(arr[i]);
        }
        System.out.println();
    }
public static void bubblesort(int arr[] ,int n){
    for(int i = 0;i<n-1;i++){
        //best case O(n^2) Worst case O(n^2)
        //for(int j = 0;j<n -1-i;j++){
        // if(arrr[j] > arr[j+1]){}
        //}
        for(int j = i+1;j<n;j++){
           if(arr[i]>arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           }
        }
    }
}

public static void bubblesortOptimized(int arr[] ,int n){
    for(int i = 0;i<n-1;i++){
        boolean swap = false;
        //best case O(n) Worst case O(n^2)
        //for(int j = 0;j<n -1-i;j++){
        // if(arrr[j] > arr[j+1]){}
        //}
        for(int j = 0;j<n-1-i;j++){
           if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            swap = true;
           }
           if(swap == false){break;}
        }

    }
}
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,6,4,9,8,7};
        int n = arr.length;
        print(arr, n);
        bubblesort(arr, n);
        print(arr, n);
    }
}
 