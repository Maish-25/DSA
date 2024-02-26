
package String;

public class StringCompression {

    public static StringBuilder compress(String str){
        StringBuilder st = new StringBuilder();
        
        for(int i = 0;i<str.length();i++){
            Integer cnt = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                cnt++;
                i++;
            }
            st.append(str.charAt(i));
            if(cnt > 1){
                st.append(cnt.toString());
            }
        }
        return st;
    }
    public static void main(String[] args) {
        String str = "aaabbbcc";
       System.out.println(compress(str));
      
    }
}
