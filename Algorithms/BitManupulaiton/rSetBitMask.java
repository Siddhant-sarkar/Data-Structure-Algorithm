import java.io.*;
import java.util.*;

public class rSetBitMask {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    long i=1;
    while(n>0){
      if(n%2==1) break;
      n/=2;
      i*=10;
    }
    System.out.println(i);

  }

}