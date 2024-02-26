package DivideandConquer;


public class quickSort {

    public static void printArr(int[] arr,int n){
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public static void quick(int arr[], int si,int ei){
      if(si<ei){
        //reursion call 
        //smaller to left and high to right
       int pIdx = partition(arr, si, ei);
       partition(arr, si, pIdx-1); // left pIdx is an pivot Index
       partition(arr, pIdx+1, ei); // right
     }   
    }

    public static int partition(int[] arr,int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<=ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp= arr[i];
                arr[i] = arr[j];
                arr[j] = temp;         
            }
        }
        int temp = arr[i+1];
        arr[i+1]  = arr[ei];
        arr[ei] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,1,6,5,9};
        int n = arr.length;
        printArr(arr, n);
        quick(arr,0,n-1);
        printArr(arr, n);
    }
}
