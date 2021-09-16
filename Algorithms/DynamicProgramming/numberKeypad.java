import java.io.*;
import java.util.*;

public class numberKeypad{

	public static boolean isValid(int i,int j){
		if((i>=0 && i<4 )&& (j>=0 && j<3)){
			if((i==3 && j==0) || (i==3 && j==2)) return false;
			return true;
		}
		return false;
	}
	public static int solution(int n) {
		int dp[][]= new int[4][3];
		int dp2[][] =new int[4][3];
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++) dp[i][j]=1;
		}
	int moves[][]={{0,0},{1,0},{0,1},{-1,0},{0,-1}};
		for(int m=2;m<=n;m++){
			for(int i=0;i<4;i++){
				for(int j=0;j<3;j++){
					for(int k=0;k<moves.length;k++){
						if(isValid(i+moves[k][0],j+moves[k][1])) {
							dp2[i][j]+=dp[i+moves[k][0]][j+moves[k][1]];
						}
					}
				}
			}
			dp=dp2;
			dp2=new int[4][3];
		}
		int total=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++) if(isValid(i,j))total+=dp[i][j];
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(solution(scn.nextInt()));
		// System.out.println(isValid(1,3));
	}

}