package SearchingAlgo;

public class LinerSearch {

  public static int linerSearch(int arr[], int target){
    for(int i = 0;i<arr.length;i++){
        if(arr[i] == target)return i;
    }
    return 0;
  }
    public static void main(String[] args) {
        int arr[] = {3,5,3,5,7,9,5};
        System.out.println("Element found at index:" + linerSearch(arr, 9));
    }
    
}
