package Arrays;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int t = 5;
        int st = 0;
        int en = arr.length -1;
        while(st <= en){
            if(arr[st] + arr[en] == t){
                System.out.println(st + " " + en);
                break;
            }
            else if(arr[st] + arr[en] > t){
                en--;
            }
            else{
                st++;
            }
        }
    }
}
