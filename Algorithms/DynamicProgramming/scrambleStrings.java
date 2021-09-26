import java.util.*;
public class scrambleStrings{

	public static boolean solve(String s1,String s2){
		if(s1.equals(s2))	return true;
		for(int i=1;i<s1.length();i++){
			if(solve(s1.substring(0,i),s2.substring(0,i)) && solve(s1.substring(i),s2.substring(i)) ) return true; // left of left and right or right 
			if(solve(s1.substring(0,i) , s2.substring(s2.length()-i)) && solve(s2.substring(0,i),s1.substring(s1.length()-i)) ) return true;
		}
		return false;
	}
	public static boolean solve2(String a,String b,int s1,int e1,int s2,int e2){
		if(a.substring(s1,e1+1).equals(b.substring(s2,e2+1))) return true;
		for(int i=0;i<e1-s1;i++){
			if(solve2(a,b,s1,s1+i,s2,s2+i) && solve2(a,b,s1+i+1,e1,s2+i+1,e2)) return true;
			if(solve2(a,b,s1,s1+i,e2-i,e2) && solve2(a,b,s1+i+1,e1,s2,e2-i-1)) return true;
		}
		return false;
	}
	public static boolean solve3(String a,String b,int s1,int s2,int l,Boolean dp[][][]){
		if(a.substring(s1,s1+l).equals(b.substring(s2,s2+l)) ) return true;

		if(dp[s1][s2][l]!=null) return dp[s1][s2][l];
		for(int i=1;i<l;i++){
			if(solve3(a,b,s1,s2,i,dp) && solve3(a,b,s1+i,s2+i,l-i,dp)) {dp[s1][s2][l]=true;return true;}
			if(solve3(a,b,s1,s2+l-i,i,dp) && solve3(a,b,s1+i,s2,l-i,dp)){dp[s1][s2][l]=true;return true;}
		}
		dp[s1][s2][l]=false;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		
		String s2=sc.nextLine();
		System.out.println(solve(s1,s2));
		System.out.println(solve2(s1,s2,0,s1.length()-1,0,s2.length()-1));
		System.out.println(solve3(s1,s2,0,0,s1.length(),new Boolean[s1.length()][s2.length()][s1.length()+1]));
	}
}