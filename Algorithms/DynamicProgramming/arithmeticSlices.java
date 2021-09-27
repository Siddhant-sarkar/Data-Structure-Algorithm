import java.io.*;
import java.util.*;

public class arithmeticSlices {

	public static int solution(int[] arr) {
		int dp[] = new int[arr.length];
		int total=0;
		for(int i=2;i<dp.length;i++){
			if(arr[i]-arr[i-1] == arr[i-1]-arr[i-2]){
				dp[i]= dp[i-1]+1;
			}
			total+=dp[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}