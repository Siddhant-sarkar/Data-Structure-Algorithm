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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(solve(str));
	}
}