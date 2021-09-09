import java.util.*;
public class circleChord{
	public static int chord(int n){
		int dp[]= new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<dp.length;i++){
			for (int j=0;j<i;j++) dp[i]+=dp[j]*dp[i-1-j];
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(chord(n));
	}
}