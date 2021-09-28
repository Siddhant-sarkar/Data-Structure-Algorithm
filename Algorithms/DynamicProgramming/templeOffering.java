import java.util.*;
public class templeOffering{
	public static void print(int []arr){
		for(int i:arr)System.out.print(i+" ");
		System.out.println();
	}
	public static int solve(int []arr){
		int n=arr.length;	
		int dp[] = new int[n]; dp[0]=1;
		int dpp[] = new int[n]; dpp[n-1]=1;
		for(int i=1;i<n;i++){
			if(arr[i]>arr[i-1]) dp[i]=dp[i-1]+1;
			else dp[i]=1;
		}
		for(int i=n-2;i>=0;i--){
			if(arr[i]>arr[i+1]) dpp[i]=dpp[i+1]+1;
			else dpp[i]=1;
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=Math.max(dp[i],dpp[i]);
		}
		// print(dp);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i  = 0;i<n;i++) arr[i] = sc.nextInt();
		int k=solve(arr);
		System.out.println(k);
	}
}