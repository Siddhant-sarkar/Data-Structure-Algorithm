import java.io.*;
import java.util.*;

public class wordBreak {

	public static boolean solution(String sentence, HashSet<String> dictionary) {
		int dp[] = new int[sentence.length()];
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<=i;j++){
				String suff= sentence.substring(j,i+1);
				if(dictionary.contains(suff)) dp[i]+=j==0?1:dp[j-1];
			}
		}
		return dp[dp.length-1]>0;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		HashSet<String> dictionary = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			dictionary.add(scn.next());
		}
		String sentence = scn.next();
		System.out.println(solution(sentence, dictionary));
	}

}