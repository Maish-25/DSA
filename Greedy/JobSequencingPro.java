package Greedy;
import java.util.*;
import java.util.Collections;

public class JobSequencingPro {
    static class Job{
       int id;
       int jobDeadline;
       int jobProfit;
         public Job(int i ,int d,int p){
           id = i;
           jobDeadline = d;
           jobProfit = p;
       }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{4,20},{1,10},{1,40}, {1,30}};
        //ob class ki arrraylist
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0], jobInfo[i][1]));
        }
        //Collections.sort(jobs , (a,b) -> a.jobProfit-b.jobProfit);//ascending order sort
        Collections.sort(jobs , (a,b) -> b.jobProfit-a.jobProfit);//descending order sort
        System.out.println(jobs);
        ArrayList<Integer> li = new ArrayList<>();
        int time = 0;
        for(int i = 0 ;i<jobs.size();i++){
            Job curr= jobs.get(i);
            if(curr.jobDeadline > time){
                li.add(curr.id);
                time++;
            }
        }
        System.out.println("max job = " + li.size());
        for(int i = 0;i<li.size();i++){
            System.out.print(li.get(i)+ " ");
        }
        System.out.println();
    }
}
