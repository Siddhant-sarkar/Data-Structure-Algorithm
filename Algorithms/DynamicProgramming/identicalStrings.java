import java.io.*;
import java.util.*;

public class identicalStrings{

	public static void print(int[][]dp){
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int solution(String s1, String s2, int c1, int c2) {
		int dp[][]= new int[s1.length()+1][s2.length()+1];
		for(int i=dp.length-1;i>=0;i--){
			for(int j=dp[0].length-1;j>=0;j--){
				if(i==dp.length-1 && j==dp[0].length-1){
					dp[i][j]=0;
				}else if(i==dp.length-1){
					dp[i][j]=dp[i][j+1]+c2;
				}else if(j==dp[0].length-1){
					dp[i][j]=dp[i+1][j]+c1;
				} else{
					if(s1.charAt(i)==s2.charAt(j)){
						dp[i][j]=dp[i+1][j+1];
					}else{
						dp[i][j]=Math.min(dp[i+1][j]+c1,dp[i][j+1]+c2);
					}
				}
			}
		}
		// print(dp);
		return dp[0][0];
		// return 0;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println(solution(s1, s2,x, y));
	}

}