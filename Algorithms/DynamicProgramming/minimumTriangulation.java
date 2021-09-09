import java.util.*;

public class minimumTriangulation{
	public static int solve(int[] arr){
		int n=arr.length;
		int dp[][]= new int[n][n];
		for(int g=0;g<dp[0].length;g++){
			for(int i=0,j=g;j<dp[0].length;i++,j++){
					if(g==0) dp[i][j]=0;
					else if(g==1)dp[i][j]=0;
					else if(g==2) dp[i][j]=arr[i]*arr[i+1]*arr[i+2];
					else{
						int min=Integer.MAX_VALUE;
						for(int k=i+1;k<=j-1;k++){
							int iTri=arr[i]*arr[j]*arr[k];
							iTri+=dp[i][k]+dp[k][j];
							min=Math.min(min,iTri);
						}
						dp[i][j]=min;
					}
			}
	}
		return dp[0][dp[0].length-1];
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) arr[i]= sc.nextInt();
		System.out.println(solve(arr));
	}
}