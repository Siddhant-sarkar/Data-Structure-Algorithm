import java.util.*;

public class inverse{

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int ans=0;
    int counter=1;
    while(a>0){
        ans+=counter*Math.pow(10,a%10);
        a/=10;
        counter++;
    }
    System.out.println(ans/10);
	sc.close();
 }
}