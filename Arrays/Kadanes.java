   package Arrays;

// kadane algo used for getting max sum 
//here we neglect the negative element
   public class Kadanes {
    public static int Sumkadanes(int arr[],int n){
        int cs = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            cs += arr[i];
            if(cs<0){
                cs = 0;
            }
            max = Math.max(cs,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int n = arr.length;
        System.out.println(Sumkadanes(arr,n));
    }
}
