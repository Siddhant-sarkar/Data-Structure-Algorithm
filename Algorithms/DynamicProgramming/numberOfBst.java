import java.util.*;
public class numberOfBst{
	public static int numberOfBst(int m){
		int dp[]=new int[m+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<dp.length;i++){
			for(int j=0;j<i;j++) dp[i]+=dp[i-1-j]*dp[j];
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(numberOfBst(n));
	}
}