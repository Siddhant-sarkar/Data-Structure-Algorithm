import java.util.*;
public class bracketPairs{
	public static int bracketPairs(int ans){
		int dp[]	= new int[ans+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<dp.length;i++){
			for(int j=0;j<i;j++){
				dp[i]+=dp[j]*dp[i-1-j];
			}
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(bracketPairs(sc.nextInt()));
		sc.close();
	}
}