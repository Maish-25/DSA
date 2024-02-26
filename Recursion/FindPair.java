package Recursion;
//print friends pairing friend can be single or double not both
public class FindPair {
    public static int findP(int n ){
        if(n==1 || n == 2)return n;
    int fnm1 = findP(n-1);
    int fnm2 = findP(n-2);
    int pairWays = (n-1) * fnm2;
    
    int total = fnm1 + pairWays;
    return total;
    //return findP(n-1) + (n-1)* findP(n-2);
    }
    public static void main(String[] args) {
        System.out.println(findP(5));
    }
}
