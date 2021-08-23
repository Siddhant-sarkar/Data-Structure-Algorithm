import java.io.*;
import java.util.*;

public class copyandMiss {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
    scn.close();
  }
  public static void solution(int[]arr){
    int n=0;
    for(int val:arr){n^=val;}
    for(int i=1;i<=arr.length;i++){
      n^=i;
    }
    int rsb=n&(-n);
    int a=0,b=0; 
    for(int val:arr){
      if((val & rsb) !=0) a^=val;
      else b^=val;
    }
    for(int i=1;i<=arr.length;i++){
      if((i&rsb)!=0) a^=i;
      else b^=i;
    }
    for(int val:arr){
      if(val==a){
        System.out.println("Missing Number -> "+b);
        System.out.println("Repeating Number -> "+a);
        return;
      }
    }
    System.out.println("Missing Number -> "+a);
    System.out.println("Repeating Number -> "+b);

  }
}