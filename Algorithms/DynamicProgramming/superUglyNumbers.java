import java.io.*;
import java.util.*;

public class superUglyNumbers{

  public static void print(int []arr){
  	for(int i:arr) System.out.print(i+" ");
  	System.out.println();
  }
  public static int solution(int[] primes, int n) {
  	int dp[] = new int[n];
  	int count[]= new int[primes.length];

  	dp[0]=1;

  	for(int i=1;i<n;i++){
  		int min=Integer.MAX_VALUE;
  		for(int j=0;j<primes.length;j++){
  			min=Math.min(min,primes[j]*dp[count[j]]);
  		}
  		dp[i]=min;
  		for(int j=0;j<primes.length;j++){
  			if(primes[j]*dp[count[j]]==min) count[j]+=1;
  		}
  	}
  	print(dp);
  	return dp[n-1];
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int k = scn.nextInt();
    int[] primes = new int[k];
    for (int i = 0 ; i < k; i++) {
      primes[i] = scn.nextInt();
    }
    int n = scn.nextInt();
    System.out.println(solution(primes, n));
  }

}