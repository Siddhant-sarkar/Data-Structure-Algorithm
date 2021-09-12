import java.util.*;
public class minimumAsciiDelete{
	public static void print(int[][]dp){
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int solve(String s1,String s2){
		int dp[][]= new int[s1.length()+1][s2.length()+1];
		for(int i=dp.length-2,j=dp[0].length-1;i>=0;i--) dp[i][j]=dp[i+1][j]+(int)s1.charAt(i);
		for(int j=dp[0].length-2,i=dp.length-1;j>=0;j-- ) dp[i][j]=dp[i][j+1]+(int)s2.charAt(j);
		for(int i=dp.length-2;i>=0;i--){
			for(int j=dp[0].length-2;j>=0;j--){
				if(s1.charAt(i)==s2.charAt(j))dp[i][j]=dp[i+1][j+1];
				else{
					int ls1=dp[i+1][j]+(int)s1.charAt(i);
					int ls2=dp[i][j+1]+(int)s2.charAt(j);
					dp[i][j]=Math.min(ls1,ls2);
				}
			}
		}
		// print(dp);
		return dp[0][0];
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=  sc.nextLine();
		String s2=  sc.nextLine();
		System.out.println(solve(s1,s2));
	}
}