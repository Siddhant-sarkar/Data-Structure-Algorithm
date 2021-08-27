import java.io.*;
import java.util.*;

public class BinReverseBinary {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();
    convert(n);
  }
  public static void convert(long n){
    long k=n;
    // String ans="";
    long rn=0;
    while(n>0){
      // ans+=n%2;
      rn=(rn|(n%2))<<1;
      n/=2;
    }

    System.out.println(Long.toBinaryString(k));
    System.out.println(rn/2);
  }

}