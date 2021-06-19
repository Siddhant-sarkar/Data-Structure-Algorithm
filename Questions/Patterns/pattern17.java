import java.util.*;
public class pattern17{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(),m=(a/2)+1,c=1;
		for(int i=1;i<=a;i++){
			// for printing the spaces
			if(i!=m) for(int j=1;j<=m-1;j++) System.out.print("\t");
			else for(int j=1;j<=m-1;j++) System.out.print("*\t");
			for(int j=1;j<=c;j++) System.out.print("*\t");
			if(i<m) c++;
			else c--;
			System.out.println();
			
		}
	}
}