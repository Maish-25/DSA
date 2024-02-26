package Recursion;

public class Tiling {
    public static int tile(int n){
        if(n == 0 || n==1)return 1;
        //if tile palced horizontally then
        // int fnm1 = tile(n -1);
        // //if tile palced vertically then
        // int fnm2 = tile(n-2);
        // return fnm1+ fnm2;
       return tile(n-1) + tile(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tile(n));
    }
}
