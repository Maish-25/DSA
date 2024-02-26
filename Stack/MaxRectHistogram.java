package Stack;
import java.util.*;

public class MaxRectHistogram {
    public static int maxAreaHistogram(int[] arr,int n){
        int maxArea = 0;
        int nsr[] = new int[n];
        int nsl[] = new int[n];
        Stack<Integer> s = new Stack<>();

        //next smaller right
        for(int i = n-1 ;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s = new Stack<>();
        for(int i = 0 ;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = n;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //max area
        for(int i = 0;i<n;i++){
            int height = arr[i];
            int width = nsr[i] -nsl[i] -1;
            int currArea =  height * width;
             maxArea = Math.max(currArea, maxArea);
        }
     return maxArea;
    }
    public static void main(String[] args) {
        int height[] = {2,4};//{2,1,5,6,2,3};
        int n = height.length;
        System.out.println(maxAreaHistogram(height, n));
    }
}
