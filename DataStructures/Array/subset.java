import java.util.*;
public class subset{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int []ar= new int[n];
		for(int i=0;i<n;i++) ar[i]= sc.nextInt();

		for(int i=0;i<1<<n;i++){
			for(int j=0;j<n;j++){
				if((i&(1<<j))==0) System.out.print(ar[j]+"\t");
				else System.out.print("-\t");
			}
			System.out.println();
		}
		sc.close();
	}
}