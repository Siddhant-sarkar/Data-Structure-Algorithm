import java.io.*;
import java.util.*;

public class rotate{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    k%=a.length;
    int []ans = new int [a.length];
    if(k>=0){
      k%=a.length;
      int c=0,f=a.length-k;
      for(int i=f;i<a.length;i++){
        ans[c]=a[i];
        c++;
      }
      for(int i=0;i<f;i++){
        ans[c]=a[i];
        c++;
      }
    }else{
      int c=0;k=-k;
      k%=a.length;
      for(int i=k;i<a.length;i++){
        ans[c]=a[i];
        c++;
      }
      for(int i=0;i<k;i++){
        ans[c]=a[i];
        c++;
      }
    }
    display(ans);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    // display(a);
 }

}