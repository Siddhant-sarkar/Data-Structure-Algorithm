import java.util.*;
public class insertionToPalindrome{

	public static void solve(String s){
		int dp[][] = new int[s.length()][s.length()];
		for(int g=0;g<dp[0].length;g++){
			for(int i=0,j=g;j<dp[0].length;i++,j++){
				if(g==0) dp[i][j]=1;
				else if(g==1) dp[i][j]=(s.charAt(i)==s.charAt(j))?2:1;
				else{
					if(s.charAt(i)!=s.charAt(j)){
						dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
					}else{
						dp[i][j]=dp[i+1][j-1]+2;
					}
				}
			}
		}
		System.out.println(s.length()-dp[0][dp[0].length-1]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l= sc.nextLine();
		solve(l);
	}
}