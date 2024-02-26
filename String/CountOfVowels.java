package String;
//import java.util.*;
public class CountOfVowels {
    public static void main(String[] args) {
        int cnt = 0;
        String str = "Manish";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
           if(ch =='a' || ch =='e' || ch =='i' || ch  =='o' || ch =='u'){
            cnt++;
           }
        }

        System.out.println(cnt);
    }
}
