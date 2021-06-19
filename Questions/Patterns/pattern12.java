import java.util.*;
public class pattern12{
	static int[] ar= new int[]{0,1,1,2,3,5,8,13,21,34,55,89,144,233,377};
	static int c=0;
	static void print(int n){
		for(int i=0;i<n;i++) {	
			System.out.print(ar[c]+"\t");
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