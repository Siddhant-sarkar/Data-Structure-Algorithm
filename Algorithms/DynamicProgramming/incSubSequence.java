import java.util.*;

public class incSubsequence{
	public static void liss(int[] arr){
		int omax=0;
		int[] dp = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int max=0;
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]){
					if(dp[j]>max){
						max= dp[j];
					}
				}
			}
			dp[i]=max+1;
			if(omax<dp[i]) omax=dp[i];
		}
		for(int val:dp)System.out.println(val);
		System.out.println(omax);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		liss(arr);
	}
}