import java.io.*;
import java.util.*;

public class frogJump {

    public static boolean solution(int[] stones) {
        HashMap<Integer,HashSet<Integer>> mp = new HashMap<>();
        for(int i:stones) mp.put(i,new HashSet<>());
        mp.get(stones[0]).add(1);
        for(int i:stones){
            HashSet<Integer> op= mp.get(i);
            System.out.println(i+" "+op);
            // if(op.size()==0) return false;
            for(int o:op){
                int ns=i+o;
                if(mp.containsKey(ns)){
                    if(o-1!=0) mp.get(ns).add(o-1);
                    mp.get(ns).add(o);
                    mp.get(ns).add(o+1);
                }
            }
        }
        return mp.get(stones[stones.length-1]).size()!=0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}