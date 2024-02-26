package SearchingAlgo;

public class BinarSearch {
    public static int binarySearch(int arr[] ,int target){
        // O(log n)
        int si= 0;
        int ei = arr.length - 1;
        while(si <= ei){
            int mid = si + (ei - si) /2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                ei  = mid - 1;
            }
            else{
                si = mid + 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 9));
    }
    
}
