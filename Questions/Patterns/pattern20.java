import java.util.*;
public class pattern20{
	static void print(int n){
		int m=(n/2);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1 || j==n) System.out.print("*\t");
				else if(i>m && ((i-j==0))||((i+j==n+1)) && i>m ) System.out.print("*\t");	
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