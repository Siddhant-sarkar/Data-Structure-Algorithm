import java.util.*;
import java.io.*;

public class longestDistinctPalindrome{
	public static int solution(String str){
		int [][] dp= new int[str.length()][str.length()];
		int prev[]= new int[str.length()];
		int next[] = new int[str.length()];
		HashMap<Character,Integer> mp= new HashMap<>();

		// filling the prev array
		for(int i=0;i<str.length();i++){
			char c= str.charAt(i);
			if(mp.containsKey(c)){
				prev[i]=mp.get(c);
			}else{
				prev[i]=-1;
			}
			mp.put(c,i);
		}
		mp.clear();

		// filling the next array
		for(int i=str.length()-1;i>=0;i--){
			char c= str.charAt(i);
			if(mp.containsKey(c)){
				next[i]=mp.get(c);
			}else{
				next[i]=-1;
			}
			mp.put(c,i);
		}
		for(int g=0;g<str.length();g++){
			for(int i=0,j=g;j<str.length();j++,i++){
				if(g==0 || g==1) dp[i][j]=g+1;
				else{
					if(str.charAt(i)!=str.charAt(j)){
						dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
					}else{
						int k=2*dp[i+1][j-1];
						int ni=next[i];
						int pi=prev[j];
						if(ni==pi) k+=1; 
						else if(ni>pi) k+=2;
						else k-=dp[ni+1][pi-1];
						dp[i][j]=k;
					}
				}
			}
		}
		return dp[0][str.length()-1];
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(solution(str));	
	}
}
