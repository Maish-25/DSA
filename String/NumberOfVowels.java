package String;

public class NumberOfVowels {
    public static void main(String[] args) {
        String str = "Manish";
        int cnt = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
