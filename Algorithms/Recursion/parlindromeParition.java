import java.io.*;
import java.util.*;

public class parlindromeParition{

	public static void solution(String str,String asf) {
		if(str.length()==0){
			System.out.println(asf);
			return;
		}
		for(int i=0;i<str.length();i++){
			String s= str.substring(0,i+1);
			String p=str.substring(i+1);
			if(isPalindrome(s)){
				solution(p,asf+"("+s+") ");
			}
		}
	}
	public static boolean isPalindrome(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solution(str,"" );
	}

}