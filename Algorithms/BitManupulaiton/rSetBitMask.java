import java.io.*;
import java.util.*;

public class rSetBitMask {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    n= n&-n;
    System.out.println(Integer.toBinaryString(n));
  }

}