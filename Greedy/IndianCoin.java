package Greedy;
import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        int[] coin = {2000,500,100,50,20,10,5,2,1};
        //or if the array is given in 1,2,50 this way
        //sort it in reverse order by
        //also the arrayDeclaration should be 
        //Integer coin[] = {.........};
        //Arrays.sort(coin , Comparator.reverseOrder());

        int numofCoin = 0;
        int amount  =  590; 
        ArrayList<Integer> li = new ArrayList<>();

        //aomunt which 
        //we have to pay by giving combination 
        //of money from the coin array
      for(int i = 0;i<coin.length;i++){
        if(coin[i] <= amount){
            while(coin[i] <= amount){
                numofCoin++;
                li.add(coin[i]);
                amount -= coin[i];
                
            }
        }
      }
      System.out.println(numofCoin + " " + li);
    }
}
