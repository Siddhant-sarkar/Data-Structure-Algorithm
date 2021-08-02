import java.io.*;
import java.util.*;

public class longestCommonSequence{

public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr= new int[n];
    for(int i=0;i<n;i++ ) arr[i]=sc.nextInt();

    HashMap<Integer,Boolean> mp=new HashMap();
    for(int i:arr){
        mp.put(i,true);
    }
    for(int i:arr){
        if(mp.containsKey(i-1)){
            mp.put(i,false);
        }
    }
    // System.out.println(mp);
    int sp=0;
    int ml=1;
    for(int i:arr){
        if(mp.get(i)){
            int tsp=i;
            int tl=1;
            while(mp.containsKey(tsp+tl)){
                tl++;
            }
            if(tl>ml){
                sp=tsp;
                ml=tl;
            }
        }
    }
    for(int i=0;i<ml;i++) System.out.println(sp+i);

 }

}