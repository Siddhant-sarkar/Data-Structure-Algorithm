import java.util.*;
public class bulbs{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int c=1;
		while(c*c<=a){
			System.out.println(c*c);
			c++;
		}
	}
}