import java.util.*;
import java.io.*;

public class minSquares{
	public static int solution(int n){
		int dp[] = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=1;i<dp.length;i++){
			int min=Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++){
				min=Math.min(dp[i-(j*j)],min);
			}
			dp[i]=(min==0)?1:min+1;
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(solution(n));
	}	

}