import java.io.*;
import java.util.*;

public class countSetBits{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

  public static int solution(int n){
    if(n==0 ){
      return 0;
    }
    int x=0,pow=1;
    while(pow <= n) { x++; pow*=2;}
    System.out.println(pow+" "+x);
    x--;pow/=2;
    return ((pow/2)*x)+(n-pow+1)+solution(n-pow);
  }

}