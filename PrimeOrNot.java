import java.util.Scanner;

/**
 * PrimeOrNot
 */
public class PrimeOrNot {

    public static boolean isPrime(int n){
        for(int i = 2;i<= Math.sqrt(n);i++){
            if(i%n==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("Not an Prime Number");
        }
    }
}