import java.util.*;
public class all1square{
	public static void print(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int Solution(int[][] arr){
		int dp[][] = new int[arr.length][arr[0].length];
		int max=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--){
			for(int j=arr[0].length-1;j>=0;j--){
				if(i==arr.length-1 || j==arr[0].length-1) dp[i][j]=(arr[i][j]==1)?1:0;
				else{
					if(arr[i][j]==0) dp[i][j]=0;
					else{
						dp[i][j]=Math.min(dp[i+1][j+1],Math.min(dp[i+1][j],dp[i][j+1]))+1;
					}
				}
			}
			max=Math.max(max,dp[i][j]);
		}
		print(dp);
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[sc.nextInt()][sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]= sc.nextInt();
			}
		}
		System.out.println(Solution(arr));
	}
}