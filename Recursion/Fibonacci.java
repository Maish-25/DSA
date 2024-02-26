package Recursion;

public class Fibonacci {
    public static int fib(int n){
        //o(2^n)
        //sc 0 (n)
        if(n == 0 || n==1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        return f1 + f2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
