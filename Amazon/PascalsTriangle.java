package Amazon;

public class PascalsTriangle {
    public static void pascals(int arr[][],int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
              if(j==0 && i==j){
                arr[i][j] = 1;
              }
              arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
       
        }
    }
    public static void print(int arr[][],int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        int n = 5;
        pascals(arr, n);
        print(arr,n);
    }
}
