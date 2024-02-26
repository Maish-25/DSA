package Backtracking;

public class FindSubset {
    public static void findSubset(String str,String ans,int i){
        //base
        //tc O(n*2^n)
        //sc O(n)
                if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //if(charwanttoadd)
        findSubset(str, ans+str.charAt(i), i+1);
        //if(donotwantotaddd)
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
         String str = "abc";
         findSubset(str, "",0);

    }
}
