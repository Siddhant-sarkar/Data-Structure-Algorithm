import java.io.*;
import java.util.*;

public class countSetBits{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

  // public static int solution(int n){
  //   int pow=1;
  //   n++;
  //   while(pow<n) pow<<=1;
  //   int sum=0;
  //   for(int i=2;i<pow;i*=2){
  //     sum+=(n/i)*(i/2);

  //   }

  //   return sum;
  // }
  public static int solution(int n){
    if(n==1){
      return 1;
    }
    int x=0,pow=1;
    while(pow <= n) { x++; pow*=2;}
    x--;pow/=2;
    return ((pow/2)*x)+(n-pow+1)+solution(n-pow);
  }

}