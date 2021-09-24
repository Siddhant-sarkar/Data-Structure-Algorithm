import java.util.*;

public class temp{
	public static void print(String s,int idx,int dc,String asf){
		if(dc==3 && Integer.parseInt(s)<=255 && !(s.charAt(0)=='0' && s.length()>1)){
			System.out.println(asf+s);

		}
		for(int i=0;i<s.length();i++){
			String num=s.substring(0,i);
			String ros=s.substring(i);
			if(num=="" || num.length()>4 ) continue;
			if( (num.charAt(0)=='0' && num.length()>1)) continue;
			int number=Integer.parseInt(num);
			try{
				if(number>=0 && number<=255){
					// System.out.println(ros);
					print(ros,idx,dc+1,asf+num+".");
				}
			}catch(Exception e){
				System.out.println(num);
			}
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st= sc.nextLine();
		// System.out.println(count);
		print(st,0,0,"");
	}
}