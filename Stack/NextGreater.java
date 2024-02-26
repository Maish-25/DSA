package Stack;
import java.util.*;
public class NextGreater {
    // public static void nextGrater(int[] arr,int n){
    //     ArrayList<Integer> li  =new ArrayList<>();
    //     for(int i = 0;i<n;i++){
    //         for(int j = i+1;j<n;j++){
    //             if(arr[i] < arr[j]){
    //               li.add(arr[j]);
    //               break;
    //             }
    //         }
    //         li.add(-1);
    //     }
    //     System.out.println(li);
    // }

    public static void nextGrater(int arr[],int n){
        //O(n) outer ,loop O(n) innerloop O(2n) == o(3n)  == O(n) as constant neglected
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        //if(if we run loop forward the we get the nextGraterRight)
        for(int i = n-1;i>=0;i--){

            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = arr[st.peek()];
            }
            st.push(i);
        }

         for(int i = 0;i<n;i++){
            System.out.print(ans[i] +" ");
         }
         System.out.println();
        //this same logic use for finding
        //next grater right this code only
        //next greater left (given in comment above)
        //next smaller in right(change condition arr[st.peek()] >= arr[i])
        //next smalller left(reverse the loop and change condition arr[st.peek()] >= arr[i])
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int n = arr.length;
        nextGrater(arr, n);
    }
}
