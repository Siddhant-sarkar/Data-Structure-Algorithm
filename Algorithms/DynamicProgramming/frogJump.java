import java.io.*;
import java.util.*;

public class frogJump {

  public static boolean solution(int[] stones) {
    boolean dp[]= new boolean[stones[stones.length-1]+1];
    boolean sl[]=new boolean[stones[stones.length-1]+1];

    for(int i:stones) sl[i]=true;
    dp[0]=true;
    int ls=1;

    for(int i=1;i<dp.length;i++){
      if(sl[i]){
        if(i-(ls+1)>=0 && dp[i-ls-1]){
          dp[i]=true;
          ls=ls+1;
        }
        else if(i-ls>=0 && dp[i-ls]){
          dp[i]=true;
        }else if(i-(ls-1)>=0 && dp[i-ls+1]) {
            dp[i]=true;
            ls=ls-1;
        }
      }
    }
    return dp[dp.length-1];
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