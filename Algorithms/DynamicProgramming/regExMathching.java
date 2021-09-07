import java.io.*;
import java.util.*;

public class regExMathching {

	public static void print(boolean[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]) System.out.print("1 ");
				else System.out.print(". ");
			}
			System.out.println();
		}
	}
	public static boolean solution(String s, String p) {
		boolean dp[][]= new boolean[p.length()+1][s.length()+1];
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				if(i==0 && j==0) dp[i][j]=true; // 0,0 the element
				else if(i==0) dp[i][j]=false; // for the 0th row
				else if(j==0){
					dp[i][j]=(p.charAt(i-1)=='*')?dp[i-2][j]:false;
				}else{
					char pc=p.charAt(i-1);
					char sc=s.charAt(j-1);
					if(pc=='*'){
						if(dp[i-2][j]){
							dp[i][j]=true;
							continue;
						}
						if(p.charAt(i-2)==s.charAt(j-1)|| p.charAt(i-2)=='.'){
							dp[i][j]=dp[i][j-1];
							continue;
						}
						dp[i][j]=false;
					}else if(pc=='.'){
						dp[i][j]=dp[i-1][j-1];
					}else if(pc==sc){
						dp[i][j]=dp[i-1][j-1];
					}else {
						dp[i][j]=false;
					}
				}
			}
		}
		print(dp);
		return dp[dp.length-1][dp[0].length-1];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}