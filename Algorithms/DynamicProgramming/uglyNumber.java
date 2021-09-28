import java.util.*;
public class uglyNumber{
	public static void print(int[] arr){
		for(int i:arr)System.out.print(i+" ");
		System.out.println();
	}
	public static int ugly(int n){
		int dp[] = new int[n];
		dp[0]=1;
		int p2=0,p3=0,p5=0;
		for(int i=1;i<n;i++){
			dp[i]=Math.min(dp[p2]*2,Math.min(dp[p3]*3,dp[p5]*5));
			if(dp[i]==dp[p2]*2) p2++;
			if(dp[i]==dp[p3]*3) p3++;
			if(dp[i]==dp[p5]*5) p5++;
		}
		return dp[n-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(ugly(n));
	}
}