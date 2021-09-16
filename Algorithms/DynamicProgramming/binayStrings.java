import java.util.*;
public class binayStrings{
	public static int solve(String str){
		int cb=str.charAt(0)=='0'?1:-1;
		int mb=str.charAt(0)=='0'?1:-1;
		for(int i=0;i<str.length();i++){
			int num=str.charAt(i)=='0'?1:-1;

			if(cb>=0) cb+=num;
			else cb=num;

			if(cb>mb) mb=cb;
		}
		return mb;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(solve(str));
	}
}