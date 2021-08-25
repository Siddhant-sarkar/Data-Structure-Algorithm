import java.io.*;
import java.util.*;

public class isPower2 {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    n-=(n&(-n));
    if(n==0) System.out.println(true);
    else System.out.println(false);
  }

}