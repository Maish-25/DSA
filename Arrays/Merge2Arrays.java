package Arrays;
//here we have to merge two array and store it in the 1st array
//the 2st array given with the 000 value which refers the empty space
public class Merge2Arrays {
    public static void merge2Array(int arr1[] , int m,int arr2[],int n){
      int i = m-1;
      int j = n-1;
      int x = m+n-1;
      while(i >= 0 && j>= 0){
        if(arr1[i] > arr2[j]){
            arr1[x] = arr1[i];
            x--;
            i--;
        }
        else{
            arr1[x] = arr2[j];
            x--;
            j--;
        }
      }
      while(j>=0){
        arr1[x] = arr2[j];
        j--;x--;
      }
    }
    public static void print(int arr[],int n){
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};

        int arr2[] = {2,5,6};
        print(arr1, arr1.length);
        print(arr2, arr2.length);
        merge2Array(arr1, 3, arr2,3);
        print(arr1, arr1.length);
    }
}
