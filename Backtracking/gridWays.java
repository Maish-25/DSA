package Backtracking;
//this problem can be easily solve by using permutation formolae
// ans = (n-1 + m-1)! / (n-1)! * (m-1)!
public class gridWays {
    //tc exponential O(2^n)
    public static int grid(int i,int j,int n,int m){
        // base 
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i==n || j == m){
            return 0;
        }
        // recursion
        int w1 = grid(i+1,j,n,m);
        int w2 = grid(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(grid(0, 0, n, m));
    }
}
