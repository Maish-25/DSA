package Amazon;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] arr,int n){
        int i = 0;
        for(int j = 1;j<n;j++){
            if(arr[i] < arr[j]){
                int temp  =arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return i+1;

    }
    public static void main(String[] args) {
           int[] arr = {0,1,1,1,1,2,2,3};
          System.out.println(removeDuplicate(arr, arr.length)); 
    }
}
