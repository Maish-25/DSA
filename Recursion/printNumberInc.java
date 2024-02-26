package Recursion;

public class printNumberInc {
    public static void printNumbersInc(int n){
       
        // if(i == n)return;
        // System.out.print(i+ " ");
        // printNumberInc(n,i+1);
         if(n==1){
            System.out.print(n+ " ");
            return;
        }
        printNumbersInc(n-1);
        System.out.print(n + " ");
        
    }
    public static void main(String[] args) {
        int n = 4;
        printNumbersInc(n);
    }
}
