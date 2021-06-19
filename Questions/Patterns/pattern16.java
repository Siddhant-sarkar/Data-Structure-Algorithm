import java.util.*;
public class pattern16{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++){
			int sp=(2*a-1)-(2*i);
			for(int j=1;j<=i;j++) {
				System.out.print(j+"\t");
			}
			for(int j=1;j<=sp;j++){
				System.out.print("\t");
			}
			if(i==a)
				for(int j=i-1;j>0;j--){
					System.out.print(j+"\t");
				}
			else
				for(int j=i;j>0;j--){
					System.out.print(j+"\t");
				}
			System.out.println();
		}
	}
}