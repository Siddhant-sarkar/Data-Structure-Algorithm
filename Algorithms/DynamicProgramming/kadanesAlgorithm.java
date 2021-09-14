import java.io.*;
import java.util.*;

public class kadanesAlgorithm {

  public static int solution(int[] arr) {
    int cb=0,mb=0;
    cb=arr[0];
    mb=arr[0];
    for(int i=1;i<arr.length;i++){
     if(cb>=0){
      cb+=arr[i];
     }else{
      cb=arr[i];
     }
     if(cb>mb) mb=cb;
    }
    return mb;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }
}