package BasicSortingAlgo;

public class CountingSort {
    public static void print(int[] arr,int n){
        for(Integer i = 0;i<n;i++){
         System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void countSort(int arr[],int n){
        int large = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            large =Math.max(large, arr[i]);
        }
        int[] temp = new int[large+1];
        for(int i = 0; i<n; i++){
            temp[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i = 0;i<n;i++){
            while(temp[i] > 0){
                arr[j] = i;
                j++;
                temp[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,6,4,9,8,7};
        int n = arr.length;
        print(arr, n);
        countSort(arr, n);
        print(arr, n);
    }
}
