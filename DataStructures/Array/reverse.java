import java.io.*;
import java.util.*;

public class reverse{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
    int s=0;
    int to=(a.length%2==1)?a.length/2:(a.length/2)-1;
    while(s<=to){
      int t=a[s];
      a[s]=a[a.length-1-s];
      a[a.length-1-s]=t;
      s++;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }

}