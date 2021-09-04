import java.io.*;
import java.util.*;

public class warmup {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    int mask=1<<m;

    System.out.println(n | (1<<i));
    System.out.println(n &(~(1<<j)));
    System.out.println(n ^ 1<<k);
    System.out.println(((n & mask)==0)?false:true);
    scn.close();
  }

}