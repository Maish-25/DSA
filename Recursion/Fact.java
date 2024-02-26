package Recursion;

public class Fact {

    public static int fact(int n){
     //tc o(n)
     //sc o(n);
        if(n==1){
            return 1;    
        }
       int factorial = n * fact(n-1);
       return factorial;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }
}
