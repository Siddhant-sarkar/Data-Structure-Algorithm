import java.io.*;
import java.util.*;

public class sumOfDifference {

  public static int csb(int a){
    int counter=0;
    while(a>0){
      a-=(a&(-a));
      counter++;
    }
    return counter;
  }
  public static long solution(int[] arr){
    int sm=0;
    for(int i=0;i<=32;i++){
      int on=0,zr=0;
      for(int val:arr){
        if((val&(1<<i))==0) zr++;
        else on++;
      }
      sm+=on*zr;
    }
    return sm*2;
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }

}