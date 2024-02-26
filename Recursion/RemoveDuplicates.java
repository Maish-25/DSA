package Recursion;

public class RemoveDuplicates {
    public static void removeDup(String str,int idx,StringBuilder str1,boolean map[]){
       
       if(idx == str.length()){
        System.out.println(str1);
        return;
       }
       char curr = str.charAt(idx);
       if(map[curr-'a'] ==true){
        removeDup(str, idx+1, str1, map);
       }
      else{
        map[curr-'a']= true;
        removeDup(str, idx+1, str1.append(curr), map);
      }
       
    }
    public static void main(String[] args){
       String str = "manishanish";
       removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
