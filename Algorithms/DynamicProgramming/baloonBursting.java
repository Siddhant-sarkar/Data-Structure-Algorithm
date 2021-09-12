import java.util.*;

public class baloonBursting{
	public static void solve (int[]arr,int n){
		int dp[][]= new int[arr.length][arr.length];
		for(int g=0;g<dp[0].length;g++){
			for(int i=0,j=g;j<dp[0].length;i++,j++){
				int max=Integer.MIN_VALUE;
				for(int k=i;k<=j;k++){
					int left=(i==k)?0:dp[i][k-1];
					int right=(k==j)?0:dp[k+1][j];
					int val=(i==0?1:arr[i-1])*arr[k]*(j==arr.length-1?1:arr[j+1]);
					max=Math.max(max,left+right+val);
				}
				dp[i][j]=max;
			}
		}
		System.out.println(dp[0][dp[0].length-1]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		solve(arr,n);
	}
}