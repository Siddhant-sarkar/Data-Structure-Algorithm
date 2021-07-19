import java.util.*;
public class pyTriplet{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
    int m =a*a + b*b +c*c;

    int ma = Math.max(Math.max(a,b),c);
    m-=ma*ma;

    if(ma*ma == m) System.out.println("true");
    else System.out.println("false");
		sc.close();
   }
  }