import java.io.*;
import java.util.*;

public class editDistance{
	
	public static void print(int [][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int solution(String str1, String str2) {
		int dp[][] = new int[str2.length()+1][str1.length()+1];
		for(int i=dp.length-1;i>=0;i--){
			for(int j=dp[0].length-1;j>=0;j--){
				if(i==dp.length-1 && j==dp[0].length-1) dp[i][j]=0;
				else if(i==dp.length-1) dp[i][j]=dp[i][j+1]+1;
				else if(j==dp[0].length-1) dp[i][j]=dp[i+1][j]+1;
				else{
					if(str1.charAt(j)==str2.charAt(i)){
						dp[i][j]=dp[i+1][j+1];
					}else{
						dp[i][j]=Math.min(dp[i+1][j+1],Math.min(dp[i+1][j],dp[i][j+1]));
						dp[i][j]++;
					}
				}
			}
		}
		print(dp);
		return dp[0][0];
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}