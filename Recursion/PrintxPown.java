package Recursion;

public class PrintxPown {
    public static int pow(int x,int n){
        //TC O(n)
        // if(n == 0){
        //     return 1;
        // }
        // return x * pow(x,n-1);

        ///OPtimize O(log n)
        if(n==0)return 1;
        //anything power 0 always 1
        int half = pow(x,n/2);
        int halfPow = half * half;
        //if n is odd the x*x^n/2* x^n/2
        //if n is even then x^n/2* x^n/2
        if(n%2 != 0){
            halfPow = x * halfPow;
        }
        return halfPow;
    }
    public static void main(String[] args) {
        System.out.println(pow(5, 2));
    }
}
