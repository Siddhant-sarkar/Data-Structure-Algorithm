import java.util.*;
public class pattern19{
	static void print(int n){
		int m=(n/2)+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				// For the center cross
				if(i==m || j== m) System.out.print("*\t"); 
				else if(i==1 && j<=m) System.out.print("*\t");
				else if(j==1 && (i>m)) System.out.print("*\t");
				else if(i==n && (j>m)) System.out.print("*\t");
				else if(j==n && (i<=m)) System.out.print("*\t");
				else System.out.print("\t");

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		print(n);
	}
}