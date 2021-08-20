import java.io.*;
import java.util.*;

public class josephus{

  public static int solution(int n){
    int i=1;
    while(i<=n) i*=2;
    i/=2;
    System.out.println(i);
    return 2*(n-i)+1;
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // solution(n);
    System.out.println(solution(n));
  }
  

}