import java.io.*;
import java.util.*;

public class threeNonOverlappingArray{
	public static int solution(int[] arr, int m, int k){
    int psum[] = new int[arr.length+1];
    // for finding the prefix sum
    for(int i=1;i<psum.length;i++){
      psum[i]=psum[i-1]+arr[i-1];
    }
    // the dp array
    int dp[][]= new int[m+1][arr.length+1];
    for(int i=1;i<dp.length;i++){
      for(int j=k;j<dp[0].length;j++){
        int ninc=dp[i][j-1];
        int inc=dp[i-1][j-k]+psum[j]-psum[j-k];
        dp[i][j]=Math.max(ninc,inc);
      }
    }
    return dp[dp.length-1][dp[0].length-1];
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int k = scn.nextInt();
    System.out.println(solution(arr, m , k));
  }

}