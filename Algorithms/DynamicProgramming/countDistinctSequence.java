import java.util.*;
import java.io.*;

public class countDistinctSequence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();

		HashMap<Character,Integer> mp= new HashMap<>();
		long dp[]= new long [s.length()+1];
		dp[0]=1;

		for(int i=1;i<dp.length;i++){
			dp[i]=dp[i-1]*2;
			char c= s.charAt(i-1);
			if(mp.containsKey(c)){
			    int j=mp.get(c);
				dp[i]-=dp[j-1];
			}
				mp.put(c,i);
		}
		System.out.println(dp[dp.length-1]-1);

	}

}