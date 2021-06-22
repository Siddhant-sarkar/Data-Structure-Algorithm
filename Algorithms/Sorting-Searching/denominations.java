import java.util.*;
public class denominations{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []ar= new int[n];
		for( int i =0;i<n;i++) ar[i] = sc.nextInt();
		int d = sc.nextInt();
		int l=0,h=n-1;
		int floor=0,ceil=0;
		while(l<=h){
			int m=(l+h)/2;
			if(d<ar[m]) {
				ceil=ar[m];
				h=m-1;
			}
			else if(d>ar[m]) {
				floor=ar[m];
				l=m+1;
			}
			else {
			}
		}
		System.out.println(ceil);
		System.out.println(floor);
	}
}