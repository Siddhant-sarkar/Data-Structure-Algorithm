import java.util.*;
public class baseConversion{
	public static int convert(int n,int fb,int tb){
		int ans=0;
		for(int i=0;n>0;i++){
			ans+=(n%tb)*Math.pow(fb,i);
			n/=tb;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),fb=sc.nextInt(),tb=sc.nextInt();
		int ans=convert(convert(n,fb,10),10,tb);
		System.out.println(ans);


	}
}