import java.io.*;
import java.util.*;

public class invalidParenthesis{

	public static void solution(String str, int minRemoval, HashSet<String> ans) {
		if(minRemoval==0){
			if(getMin(str)==0){
				if(ans.contains(str)==false){
					System.out.println(str);
				}
				ans.add(str);
			}
			return;
		}
		for(int i=0;i<str.length();i++){
			String k=str.substring(0,i)+str.substring(i+1);
			solution(k,minRemoval-1,ans);
		}
	}

	public static int getMin(String str){
		Stack<Character> st= new Stack<>();
		for(int i=0;i<str.length();i++)	{
			char c= str.charAt(i);
			if(c=='('){
				st.push(c);
			}else if(c==')'){
				if( st.size()!=0 && st.peek()=='(') st.pop();
				else st.push(c);
			}
		}
		return st.size();

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str, getMin(str),new HashSet<>());
	}
		
}