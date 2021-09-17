import java.io.*;
import java.util.*;

public class opGame {

	public static void optimalStrategy(int[] arr) {
		int dp[][] = new int[arr.length][arr.length];
		for(int g=0;g<dp[0].length;g++){
			for(int i=0,j=g;j<dp[0].length;j++,i++){
				if(g==0) dp[i][j]= arr[i];
				else if(g==1) dp[i][j]= Math.max(arr[i],arr[j]);
				else{
					int down=Math.min(dp[i+2][j],dp[i+1][j-1])+arr[i];
					int left=Math.min(dp[i][j-2],dp[i+1][j-1])+arr[j];
					dp[i][j]=Math.max(down,left);
				}

			}
		}
		System.out.println(dp[0][dp[0].length-1]);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
		optimalStrategy(a);
	}

}