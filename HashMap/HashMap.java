package HashMap;
import java.util.*;



class HashMap{

    public static void main(String[] args) {
        String str ="Manish";
        Map<Character, Integer> mp = new java.util.HashMap<>();

        for(char c : str.toCharArray()){
            mp.put(c, mp.getOrDefault(mp , 0) + 1);
        }
     
        System.out.println(mp);

    }
}