package Patterns;

/**
 * Pattern4
 */
public class Pattern4 {
public static void main(String[] args) {
    int n = 4;
        for(int i = 1;i<=n;i++){
             //space
             for(int j = n;j>i;j--){
                System.out.print(" ");
            }
          
            for(int k = 0;k<i;k++){
                System.out.print("* ");
            }
            
            System.out.println();
          
        }
    }
}
    
