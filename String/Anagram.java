package String;
import java.util.*;
public class Anagram {
    public static boolean ana(String str1,String str2){
        if(str1.length() != str2.length())return false;

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
    public static void main(String[] args) {
         String str = "Manish";
         String str1 = "hsinaM";
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
       if(ana(str, str1)){
        System.out.println("Both are Anagram");
       }
       else{
        System.out.println("Not anagram");
       }
        
         
    }
}
