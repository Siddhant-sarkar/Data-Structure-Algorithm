import java.io.*;
import java.util.*;

public class eggdrop {

	public static int eggDrop(int n, int f){
		int dp[][] = new int[n+1][f+1];
		for(int i=1;i<=n;i++){
			for(int j=0;j<=f;j++){
				if(j==0) dp[i][j]=0;
				else if (j==1) dp[i][j]=1;
				else if(i==1) dp[i][j]=j;
				else{
					int max=Integer.MAX_VALUE;		
					for(int k=0;k<j;k++) max=Math.min(max,Math.max(dp[i-1][k],dp[i][j-1-k])+1);
					dp[i][j]=max;
				}
			}
		}
		return dp[n][f];
	} 

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//n -> number of eggs and k -> number of floors
		int n = scn.nextInt();
		int k = scn.nextInt();
		System.out.println(eggDrop(n,k));
	}
	
}