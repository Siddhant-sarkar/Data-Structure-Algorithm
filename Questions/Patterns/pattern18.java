import java.util.*;
public class pattern18{
	static void print(int sp,int st,int r,int n){
		for(int i=1;i<=sp;i++) System.out.print("\t");
		if(r==1 || r>n/2)
			for(int j=1;j<=st;j++) System.out.print("*\t");
		else 
			for(int j=1;j<=st;j++){
				if(j==1 || j==st) System.out.print("*\t");
				else System.out.print("\t");
			}

		System.out.println();
	}
	static void print(int n){
		int st=n,sp=0;
		for(int i=1;i<=n;i++){
			print(sp,st,i,n);
			if(i<=n/2){
				st-=2;
				sp++;
			}else{
				st+=2;
				sp--;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		print(a);
	}
}