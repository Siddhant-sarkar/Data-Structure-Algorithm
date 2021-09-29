import java.io.*;
import java.util.*;

public class findWater {
  public static void print(double[][] dp){
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[0].length;j++){
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static double solution(int kl, int r, int c) {
    double dp[][]= new double[kl+1][kl+1];
    dp[0][0]=kl;
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<=i;j++){
        if(dp[i][j]>1.0){
          double spare=dp[i][j]-1.0;
          dp[i][j]=1.0;
          dp[i+1][j]+=spare/2.0;
          dp[i+1][j+1]+=spare/2.0;
        }
      }
    }
    return dp[r][c];
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int k = scn.nextInt();
    int r = scn.nextInt();
    int c = scn.nextInt();
    System.out.println(solution(k, r, c));
  }

}