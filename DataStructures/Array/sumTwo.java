import java.util.*;
public class sumTwo{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1=sc.nextInt();
		int []ar1 = new int [n1];
		for(int i=0;i<n1;i++) ar1[i]=sc.nextInt();
		int n2=sc.nextInt();
		int []ar2 = new int [n2];
		for(int i=0;i<n2;i++) ar2[i]=sc.nextInt();
		int []ans = new int[Math.max(n1,n2)];

		int i=n1-1,j=n2-1,k=Math.max(n1,n2)-1,c=0;

		// System.out.println(k);
		while(i>=0 || j>=0){
			int a=(i<0)?0:ar1[i];
			int b=(j<0)?0:ar2[j];
			int cs=a+b+c;
			c=cs/10;
			ans[k]=cs%10;
			i--;
			j--;
			k--;
		}
		if (c!=0) System.out.print(c);
		for(int m=0;m<ans.length;m++) System.out.println(ans[m]);

	}
}