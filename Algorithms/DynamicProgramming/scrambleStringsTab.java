import java.util.*;
public class scrambleStringsTab{
	public static boolean Solve(String s1,String s2){
		int n = s1.length();
		boolean dp[][][] = new boolean [n][n][n+1];
		for(int l=1;l<=n;l++){
			for(int i=0;i<=n-l;i++){
				for(int j=0;j<=n-l;j++){
					if(l==1) dp[i][j][l]=(s1.charAt(i)==s2.charAt(j))?true:false;
					else {
						for(int k=1;k<l && !dp[i][j][l];k++){
							dp[i][j][l]=( (dp[i][j][k] && dp[i+k][j+k][l-k]) || (dp[i][j+l-k][k] && dp[i+k][j][l-k]) );
						}
					}
				}
			}
		}
		return dp[0][0][n];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		System.out.println(Solve(s1,s2));
	}
}