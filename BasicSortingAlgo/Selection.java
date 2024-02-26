package BasicSortingAlgo;

public class Selection {

    public static void print(int[] arr,int n){
        for(int i = 0;i<n;i++){
         System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void selection(int arr[],int n){
        
        for(int i = 0;i<n;i++){
            int minPos = i;
            for(int j = i+1;j<n;j++){
                if(arr[minPos] < arr[j]){
                    minPos= j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,6,4,9,8,7};
        int n = arr.length;
        print(arr, n);
        selection(arr, n);
        print(arr, n);
    }
}
