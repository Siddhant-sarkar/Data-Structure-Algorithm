import java.util.*;
public class longestCommonSubstring{
	public static int solve(String s1,String s2){
		int dp[][]	 = new int[s1.length()+1][s2.length()+1];
		int mmax=Integer.MIN_VALUE;
		for(int i=1;i<dp.length;i++){
			for(int j=1;j<dp[0].length;j++){
				dp[i][j]=(s1.charAt(i-1)==s2.charAt(j-1))?dp[i-1][j-1]+1:0;
				mmax=Math.max(mmax,dp[i][j]);
			}
		}
		return mmax;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		System.out.println(solve(s1,s2));
	}
}