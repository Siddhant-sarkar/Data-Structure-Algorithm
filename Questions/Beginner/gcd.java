import java.util.*;
public class gcd{
	static int findGcd(int a,int b){
		return b==0 ? a : findGcd(b,a%b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int g=findGcd(a,b);

		System.out.println(g);
		System.out.println(a*b/g);
		sc.close();
	}
}