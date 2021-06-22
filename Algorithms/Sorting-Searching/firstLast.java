import java.util.*;
public class firstLast{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int []ar = new int[n];
		for( int i=0;i<n;i++) ar[i] = sc.nextInt();
		int d = sc.nextInt();
		int l=0,h=n-1,m=-1;
		int f=-1,ls=-1;
		while(l<=h){
			m=(l+h)/2;
			if(d<ar[m]) h=m-1;
			else if(d>ar[m]) l=m+1;
			else{
				f=m;
				h--;
			}
		}
		l=0;h=n-1;m=-1;
		while(l<=h){
			m=(l+h)/2;
			if(d<ar[m]) h=m-1;
			else if(d>ar[m]) l=m+1;
			else{
				ls=m;
				l++;
			}
		}
		System.out.println(f);
		System.out.println(ls);
	}
}