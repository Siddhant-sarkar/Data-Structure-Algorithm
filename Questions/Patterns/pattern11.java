import java.util.*;
public class pattern11{
	static int c=1;
	static void print(int n){
		for(int i=1;i<=n;i++) {	
			System.out.print(c+"\t");
			c++;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i =1;i<=n;i++){
			print(i);
		}
	}
}