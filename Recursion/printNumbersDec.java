package Recursion;

public class printNumbersDec {
    public static void printNumbersDec(int n){
        if(n==0){
            return;
            //Sysetm.out.print(n);
            //return;
        }
        System.out.print(n + " ");
        printNumbersDec(n-1);
    }
    public static void main(String[] args) {
        int n= 4;
        printNumbersDec(n);
    }
}
