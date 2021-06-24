
import java.util.*;
public class difference{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1=sc.nextInt();
		int []ar1 = new int [n1];
		for(int i=0;i<n1;i++) ar1[i]=sc.nextInt();
		int n2=sc.nextInt();
		int []ar2 = new int [n2];
		for(int i=0;i<n2;i++) ar2[i]=sc.nextInt();
		sc.close();
		int []ans = new int[Math.max(n1,n2)];

		int i=n1-1,j=n2-1,k=Math.max(n1,n2)-1;
		boolean br=false;
		while(i>=0 || j>=0 ){
			int a=(i<0) ?0: ar1[i];
			int b=(j<0) ?0: ar2[j];
			if(br) b--;
			if(b>=a){
				br=false;
				ans[k]=b-a;
			}else{
				br=true;
				ans[k]=b-a+10;
			}
			i--;
			j--;
			k--;
		}
		if(ans[0]==0) for(i=1;i<ans.length;i++) System.out.println(ans[i]);
		else for(i=0;i<ans.length;i++) System.out.println(ans[i]);

	}
}