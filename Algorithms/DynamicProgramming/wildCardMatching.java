import java.util.*;
public class wildCardMatching{
	public static boolean solve(String str,String patt){
		boolean dp[][]= new boolean[patt.length()+1][str.length()+1];
		for(int i=dp.length-1;i>=0;i--){
			for(int j=dp[0].length-1;j>=0;j--){
				if(i==dp.length-1 && j==dp[0].length-1){
					dp[i][j]=true;
				}else if(i==dp.length-1){
					dp[i][j]=false;
				}else if(j==dp[0].length-1){
					dp[i][j]=(patt.charAt(i)=='*')?dp[i+1][j]:false;
				}else{
					if(patt.charAt(i)==str.charAt(j)){
						dp[i][j]=dp[i+1][j+1];
					}else if(patt.charAt(i)=='?'){
						dp[i][j]=dp[i+1][j+1];
					}else if(patt.charAt(i)=='*'){
						dp[i][j]=dp[i][j+1]||dp[i+1][j];
					}
				}
			}
		}
		return dp[0][0];
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String patt= sc.nextLine();
		System.out.println(solve(str,patt));
	}
}