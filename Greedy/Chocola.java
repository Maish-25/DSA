package Greedy;
import java.util.*;

public class Chocola {
  public static void main(String[] args) {
    int n = 4, m = 6;
    Integer cosVer[] = {2,1,3,1,4}; //m-1
    Integer cosHor[] = {4,1,2}; //n-1
    
    Arrays.sort(cosHor, Collections.reverseOrder());
    Arrays.sort(cosVer,  Collections.reverseOrder());
    int h = 0 , v= 0;
    int hp = 1,vp = 1;
    int cost = 0;
    while(h < cosHor.length && v < cosVer.length){
        if(cosVer[v] <= cosHor[h]){//horzontal
            cost +=(cosHor[h] * vp);
            hp++;
            h++;
        }
        else{
            //vertical
            cost += (cosVer[v] * hp);
            vp++;
            v++;
        }
    }
    //for remaining horizontal cut
    while(h<cosHor.length){
        cost += (cosHor[h] * vp);
        hp++;
        h++;
    }
    //for remaining vertical cut
    while(v < cosVer.length){
        cost += (cosVer[v] * hp);
        vp++;
        v++;
    }
    System.out.println(cost);
  }
}
