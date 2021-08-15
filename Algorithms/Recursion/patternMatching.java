import java.io.*;
import java.util.*;

public class patternMatching{

	public static void solution(String str, String pattern, HashMap<Character,String> map, String op){
		if(pattern.length()==0){
			if(str.length()==0){
				HashSet<Character> st= new HashSet<>();
				for(int i=0;i<op.length();i++){
					char k= op.charAt(i);
					if(st.contains(op.charAt(i))==false){
						System.out.print(k+" -> "+map.get(k)+", ");
						st.add(k);
					}
				}
				System.out.println(".");
			}
			return;
		}
		char c= pattern.charAt(0);
		String rop=pattern.substring(1);
		if(map.containsKey(c)){
			String pv= map.get(c);
			if(str.length()>=pv.length()){
				String lh= str.substring(0,pv.length());
				String rh= str.substring(pv.length());
				if(pv.equals(lh)) solution(rh,rop,map,op);
			}
		}else{
			for(int i=0;i<str.length();i++){
				String lh=str.substring(0,i+1);
				String rh=str.substring(i+1);
				map.put(c,lh);
				solution(rh,rop,map,op);
				map.remove(c);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String pattern = scn.next();
		HashMap<Character,String> map = new HashMap<>();
		solution(str,pattern,map,pattern);
	}
}