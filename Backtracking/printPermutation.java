package Backtracking;
public class printPermutation{
    public static void permutation(String str,String ans){
        //base
        //Tc O(n*n!)
    
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
          for(int  i = 0;i<str.length();i++){
           char curr = str.charAt(i);
           String Newstr = str.substring(0, i) + str.substring(i+1);
           permutation(Newstr, ans+curr);
        }
    }
   public static void main(String[] args) {
    String str= "abc";
    permutation(str, "");
   }
}