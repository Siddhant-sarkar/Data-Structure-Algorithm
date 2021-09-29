import java.util.*;
public class distinctEcho{
	public static int solve(String str){
		HashSet<String> st = new HashSet<>();
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length();j++){
				int l=j-i+1;
				if(l%2==0){
					String lh=str.substring(i,i+l/2);
					String rh= str.substring(i+l/2,i+l);
					if(lh.equals(rh) && !st.contains(str.substring(i,i+l))){
						st.add(str.substring(i,i+l));
						count++;
					}
				}
			}
		}
		System.out.println(st);
		return count;
	}
	static long hash[];
	static long pow[];
	static long radix=256;
	static long mod=(long) 1e9+7;
	public static void process(String s,int n){
		hash = new long[n];
		pow = new long[n];
		pow[0]=1;
		for(int i=1;i<n;i++){
			hash[i]	= (hash[i-1]*radix+s.charAt(i))%mod;
			pow[i]=(pow[i-1]*radix)%mod;
		}
	}
	public static long calc(int l,int r){
		long hv=(hash[r]-hash[l]*pow[r-l]%mod+mod)%mod;
		return hv;
	}
	public static int solve2(String s){
		int n= s.length();
		HashSet<Long> st = new HashSet<>();
		process(s,s.length());
		for(int l=1;l<=n/2;l++){
			int count=0;
			for(int i=0,j=l;j<n;i++,j++){
				if(s.charAt(i)==s.charAt(j)) count++;
				else{
					count=0;
				}
				if(count==l){
					st.add(calc(i,j));
					count--;
				}
			}
		}
		return st.size();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(solve2(str));
	}
}