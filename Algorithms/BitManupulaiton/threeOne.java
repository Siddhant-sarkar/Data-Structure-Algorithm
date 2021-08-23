import java.io.*;
import java.util.*;

public class threeOne {

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
    int t=Integer.MAX_VALUE,t1=0,t2=0;
    for(int i=0;i<arr.length;i++){
      int c=arr[i]&t;
      int c1=arr[i]&t1;
      int c2=arr[i]&t2;

      t&=~c;t1|=c;
      t1&=~c1;t2|=c1;
      t2&=~c2;t|=c2;
    }
    System.out.println(t1);
  }

}