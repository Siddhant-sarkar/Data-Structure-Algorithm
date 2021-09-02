import java.util.*;
import java.io.*;

public class longestSubsequence{
	public static void print(int[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine()	;
		String s2=sc.nextLine();
		int dp[][]=new int[s2.length()+1][s1.length()+1];
		for(int i=0;i<s1.length();i++) dp[s2.length()][i]=0;
		for(int i=0;i<s2.length();i++) dp[i][s1.length()]=0;

		for(int i=dp.length-2;i>=0;i--){
			for(int j=dp[0].length-2;j>=0;j--){
				if(s2.charAt(i)==s1.charAt(j)){
					dp[i][j]=dp[i+1][j+1]+1;

					// dp[i][j]=1;
				}else{
					dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
					// dp[i][j]=0;
				}
			}
		}
		print(dp);
		System.out.println(dp[0][0]);
	}
}