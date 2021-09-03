import java.util.*;
import java.io.*;

public class longestPalindromicSubstring{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s= sc.nextLine();

		boolean dp[][] = new boolean[s.length()][s.length()];
		int maxg=0;
		for(int g=0;g<s.length();g++){
			for(int i=0,j=g;j<s.length();j++,i++)	{
				if(j>=i){
					if(g==0) {dp[i][j]=true;maxg=g;}
					else if(g==1) {dp[i][j]=(s.charAt(i)==s.charAt(j))?true:false;if(dp[i][j]) maxg=g;}
					else {
						if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1] ){
							dp[i][j]=true;
							maxg=g;
						}else{
							dp[i][j]=false;
						}
					}
				}
			}
		}
		System.out.println(maxg+1);	
	}
}