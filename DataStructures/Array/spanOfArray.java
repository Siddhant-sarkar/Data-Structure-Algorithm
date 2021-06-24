
import java.util.*;

public class spanOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int []ar = new int [n];
		int min=99999999,max=-9999;
		for(int i=0;i<n;i++){
			ar[i]= sc.nextInt();
			min=Math.min(min,ar[i]);
			max=Math.max(max,ar[i]);
		}
		System.out.println(max-min);
	sc.close();
 }

}
