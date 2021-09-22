import java.io.*;
import java.util.*;

public class cherryPickupOP {
	public static int cherry(int i,int j,int ii,int jj,int [][]arr,int dp[][][][]){
		int n=arr.length;

		if(i>=n || j>=n || ii>=n || jj>=n || arr[i][j]==-1 || arr[ii][jj]==-1){ return Integer.MIN_VALUE; }
		if(i==n-1 && j==n-1) return arr[i][j];

		int c=0;
		if(i==ii && j==jj) c+=arr[i][j];
		else c+=arr[i][j]+arr[ii][jj];

		if(dp[i][j][ii][jj]!=0)	return dp[i][j][ii][jj];

		int a=cherry(i+1,j,ii+1,jj,arr,dp);
		int b=cherry(i+1,j,ii,jj+1,arr,dp);
		int c2=cherry(i,j+1,ii,jj+1,arr,dp);
		int d=cherry(i,j+1,ii+1,jj,arr,dp);
		int val=Math.max(Math.max(a,b),Math.max(c2,d));

		c+=val;
		dp[i][j][ii][jj]=c;
		return c;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0 ; j < n; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		int val= cherry(0,0,0,0,arr,new int[n][n][n][n]);
		System.out.println(val);
	}

}