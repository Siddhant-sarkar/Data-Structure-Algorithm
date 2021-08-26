import java.io.*;
import java.util.*;

public class oddEvenSwap{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int om=0x55555555;
    int em=0xAAAAAAAA;

    int ev=n&em;
    int ov=n&om;
    int m=(ev>>1)|(ov<<1);
    System.out.println(m);
    
  }

}