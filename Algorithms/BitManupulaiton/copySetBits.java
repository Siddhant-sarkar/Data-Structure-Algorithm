import java.io.*;
import java.util.*;

public class copySetBits{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int left = scn.nextInt();
    int right = scn.nextInt();
    int o=1<<(right-left+1);
    o--;
    o=o<<left-1;
    o=o&a;
    b=b|o;
    System.out.println(b);

  }

}