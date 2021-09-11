import java.io.*;
import java.util.*;

public class optimalBst {
	public static void print(int[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(i>j) System.out.print(". ");
				else System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
  private static void optimalbst(int[] keys, int[] frequency, int n) {
  	int dp[][] = new int[n][n];
  	int psum[]=new int[n+1];
  	psum[0]=frequency[0];
  	for(int i=1;i<n;i++){
  		psum[i]=frequency[i]+psum[i-1];
  	}
  	for(int g=0;g<dp[0].length;g++){
  		for(int i=0,j=g;j<dp[0].length;j++,i++){
  			if(g==0){
  				dp[i][j]=frequency[i];
  			}else if(g==1){
  				dp[i][j]=Math.min(frequency[i]+2*frequency[j],frequency[j]+2*frequency[i]);
  			} else{
  				int min=Integer.MAX_VALUE;
  				int fs=psum[j]-((i==0)?0:psum[i-1]);
  				for(int k=i;k<=j;k++){
  					int lf=k==i?0:dp[i][k-1];
  					int rt=k==j?0:dp[k+1][j];
  					int total=lf+rt+fs;
  					min=Integer.min(min,total);
  				}
  				dp[i][j]=min;
  			}
  		}
  	}
   	System.out.println(dp[0][dp[0].length-1]); 
	}

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	int[] keys = new int[n];
	int[] frequency = new int[n];
    for(int i= 0 ;i < n ; i++) {
		keys[i] = scn.nextInt();
	}
	for(int i = 0 ; i < n; i++){
      frequency[i] = scn.nextInt();
    }
	optimalbst(keys,frequency,n);
	}

}