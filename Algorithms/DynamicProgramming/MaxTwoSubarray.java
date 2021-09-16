import java.io.*;
import java.util.*;

public class MaxTwoSubarray {

	public static void print(int[]arr){
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static int solution(int[] arr, int x, int y){
		// x -> y
		int max1=Integer.MIN_VALUE;
		int dp1[] = new int[arr.length];
		int dp2[] = new int[arr.length];
		int sum=0;

		// when x comes first
		int n=arr.length;
		for(int i=0;i<dp1.length;i++){
			if(i<x)	{
				sum+=arr[i];
				dp1[i]=sum;
			}else{
				sum+=arr[i]-arr[i-x];
				dp1[i]=Math.max(dp1[i-1],sum);
			}
		}
		sum=0;
		for(int i=arr.length-1;i>=0;i--){
			if(i+y>=n){
				sum+=arr[i];
				dp2[i]=sum;
			}else{
				sum+=arr[i] - arr[i+y];
				dp2[i]=Math.max(sum,dp2[i+1]);
			}
		}
		for(int i=x-1;i<n-y;i++)	max1= Math.max(max1,dp1[i]+dp2[i+1]);
		dp1 = new int[n];
		dp2 = new int[n];
		sum=0;

		// when x comes first
		for(int i=0;i<dp1.length;i++){
			if(i<y)	{
				sum+=arr[i];
				dp1[i]=sum;
			}else{
				sum+=arr[i]-arr[i-y];
				dp1[i]=Math.max(dp1[i-1],sum);
			}
		}
		sum=0;
		for(int i=arr.length-1;i>=0;i--){
			if(i+x>=arr.length){
				sum+=arr[i];
				dp2[i]=sum;
			}else{
				sum+=arr[i] - arr[i+x];
				dp2[i]=Math.max(sum,dp2[i+1]);
			}
		}	
		for(int i=x-1;i<n-y;i++)	max1= Math.max(max1,dp1[i]+dp2[i+1]);
		return max1;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = scn.nextInt();
		}
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println(solution(arr,x,y));
	}

}