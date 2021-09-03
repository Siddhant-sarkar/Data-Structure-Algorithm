import java.util.*;
import java.io.*;

public class countPalindromicSubstring{
	public static void print(boolean[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i][j]) System.out.print("1 ");
				else System.out.print("- ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		boolean dp[][] = new boolean[s.length()][s.length()];
		int count=0;
		for(int g=0;g<s.length();g++){
			for(int i=0,j=g;j<s.length();i++,j++){
				if(j>=i){
					if(g==0) {dp[i][j]=true; count++;}
					else if(g==1){
						dp[i][j]=(s.charAt(i)==s.charAt(j))?true:false;
						if(dp[i][j]) count++;
					}else{
						if(s.charAt(i)==s.charAt(j)){
							if(dp[i+1][j-1]) {dp[i][j]=true;count++;}
						}else{
							dp[i][j]=false;
						}
					}
				}
			}
		}
		// print(dp);
		System.out.println(count);
	}
}