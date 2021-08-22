import java.io.*;
import java.util.*;

public class twoDifferent {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
    int tx=0;  
    for(int i=0;i<arr.length;i++) tx^=arr[i];
    int rsb=tx&(-tx);
    // System.out.println(rsb);
    int n1=0,n2=0;
    for(int i=0;i<arr.length;i++){
      if((arr[i]&(rsb))!=0) n1^=arr[i];
      else n2^=arr[i];
    }
    System.out.println(n1);
    System.out.println(n2);
  }

}