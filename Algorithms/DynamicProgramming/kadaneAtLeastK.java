import java.io.*;
import java.util.*;

public class kadaneAtLeastK {

  public static int solution(int[] arr, int k) {
    int ans=0;
    int cb=arr[0];
    int[] mx= new int[arr.length];
    mx[0]=cb;
    for(int i=1;i<arr.length;i++){
      if(cb>0) cb+=arr[i];
      else cb=arr[i];

      mx[i]=cb;
    }
    int exk=0;
    for(int i=0;i<k;i++){
      exk+=arr[i];
    }
    if(exk>ans) ans=exk;

    for(int i=k;i<arr.length;i++){
      exk=exk+arr[i]-arr[i-k];
      if(exk>ans) ans=exk;
      int morek=exk+mx[i-k];
      if(morek>ans) ans=morek;
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    System.out.println(solution(arr, k));
  }
}