import java.io.*;
import java.util.*;

public class Different{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int a=0;
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
      a^=arr[i];
    }
    System.out.println(a);
    
  }

}