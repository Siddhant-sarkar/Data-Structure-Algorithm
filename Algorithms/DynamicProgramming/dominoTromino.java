import java.util.*;

public class dominoTromino{
	public static void print(long[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int solve(int n){
		long mod=1000000007;
		long dp[][]= new long[n+1][2];
		dp[0][0]=1;
		dp[1][0]=1;
		for(int i=2;i<=n;i++){
			dp[i][0]=(dp[i-1][0]+dp[i-2][0]+dp[i-1][1])%mod;
			dp[i][1]=((dp[i-2][0]*2)+dp[i-1][1])%mod;
		}
		return (int)dp[n][0];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(solve(n));
	}
}