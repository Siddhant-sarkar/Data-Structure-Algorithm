import java.util.*;

public class palindromicCut{
	// This method is not as optimized as it runs on O(n3);
	public static int solve(String s){
		boolean is[][]= new boolean[s.length()][s.length()];
		for(int g=0;g<is[0].length;g++){
			for(int i=0,j=g;j<is[0].length;i++,j++){
				if(g==0) is[i][j]=true;
				else if(g==1) is[i][j]=(s.charAt(i)==s.charAt(j))?true:false;
				else{
					if(s.charAt(i)==s.charAt(j) && is[i+1][j-1]) is[i][j]=true;
					else is[i][j]=false;
				}
			}
		}
		int[][] dp = new int[s.length()][s.length()];
		for(int g=0;g<dp[0].length;g++){
			for(int i=0,j=g;j<dp[0].length;i++,j++){
				if(g==0) dp[i][j]=0;
				else if(g==1) dp[i][j]=(is[i][j])?0:1;
				else{
					if(is[i][j]) dp[i][j]=0;
					else{
						int min=Integer.MAX_VALUE;
						for(int k=i;k<j;k++){
							min=Math.min(min,dp[i][k]+dp[k+1][j]+1);
						}
						dp[i][j]=min;
					}
				}
			}
		}
		return dp[0][dp[0].length-1];
	}
	public static int solveOP(String s){
		boolean is[][]= new boolean[s.length()][s.length()];
		for(int g=0;g<is[0].length;g++){
			for(int i=0,j=g;j<is[0].length;i++,j++){
				if(g==0) is[i][j]=true;
				else if(g==1) is[i][j]=(s.charAt(i)==s.charAt(j))?true:false;
				else{
					if(s.charAt(i)==s.charAt(j) && is[i+1][j-1]) is[i][j]=true;
					else is[i][j]=false;
				}
			}
		}
		int dp[]= new int[s.length()];
		dp[0]=0;
		for(int j=1;j<dp.length;j++){
			if(is[0][j]) dp[j]=0;
			else{
				int min=Integer.MAX_VALUE;
				for(int i=j;i>=1;i--){
					if(is[i][j]){
						if(dp[i-1]<min){
							min=dp[i-1];
						}
					}
				}
				dp[j]=min+1;
			}
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solveOP(str));
	}
}