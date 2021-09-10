import java.util.*;
public class rodcutting{
	public static void solve(int[]arr ,int n){
		int dp[] = new int[n+1];
		dp[0]=0;
		dp[1]=arr[1];
		for(int i=2;i<dp.length;i++){
			int max=arr[i];
			for(int j=1;j<i;j++){
				max=Math.max(max,arr[j]+dp[i-j]);
			}
			dp[i]=max;
		}
		for(int i:dp) System.out.println(i);
		System.out.println(dp[dp.length-1]);
	}
	public static void solveOp(int[]arr,int n){
		int dp[] = new int[n+1];
		dp[0]=0;
		dp[1]=arr[1];
		for(int i=2;i<dp.length;i++){
			int max=arr[i];
			for(int j=1;j<i/2;j++){
				max=Integer.max(max,dp[j]+dp[i-j]);
			}
			dp[i]=max;
		}
		System.out.println(dp[dp.length-1]);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n+1];
		for(int i=1;i<n+1;i++) arr[i]=sc.nextInt();
		solveOp(arr,n);

	}
}