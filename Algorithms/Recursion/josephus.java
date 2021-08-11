import java.io.*;
import java.util.*;

public class josephus {

  public static int solution(int n, int k){
    if(n==0){
      return n;
    }

    int t=solution(n-1,k);
    return (t+k)%n;
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    System.out.println(solution(n,k));
  }
  

}