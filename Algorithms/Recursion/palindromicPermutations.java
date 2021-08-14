import java.io.*;
import java.util.*;

public class palindromicPermutations {

	public static void generatepw(int cs, int ts, HashMap<Character, Integer> fmap, Character oddc, String asf) {
		if(cs>ts){
			String r="";
			for(int i=asf.length()-1;i>=0;i--){
				r+=asf.charAt(i);
			}
			String ans=asf;
			ans+=(oddc!=null)?oddc:"";
			ans+=r;
			System.out.println(ans);
			return;
		}
		for(char c: fmap.keySet()){
			int fr=fmap.get(c);
			// System.out.println("here");
			if(fr!=0){
				fmap.put(c,fr-1);
				generatepw(cs+1,ts,fmap,oddc,asf+c);
				fmap.put(c,fr);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		HashMap<Character, Integer> fmap = new HashMap<>();

		Character odd=null;
		int odds=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(fmap.containsKey(ch)){
				fmap.put(ch,fmap.get(ch)+1);
			}else {
				fmap.put(ch,1);
			}
		}
		int l=0;
		for(char c:fmap.keySet()){
			int fq=fmap.get(c);
			if(fq%2==1){
				odd=c;
				odds++;
			}
			fmap.put(c,fq/2);
			l+=fq/2;
		}
		if(odds>1){
			System.out.println(-1);
			return;
		}
		// System.out.println(fmap);
		// System.out.println(l);
		generatepw(1,l,fmap,odd,"");
	}
	
}