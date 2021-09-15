import java.io.*;
import java.util.*;

public class kadaneConcatenate {

  public static long solution(int[] arr, int k, long sum) {
    int cb=arr[0];
    int mb=arr[0];
    int l=arr.length;
    for(int i=1;i<k*arr.length;i++){
      if(cb>=0) cb+=arr[i%l];
      else cb=arr[i%l];

      if(cb>mb) mb=cb;

    }
    return mb;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    long sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
      sum += arr[i];
    }
    int k = scn.nextInt();
    System.out.println(solution(arr, k, sum));
  }

}