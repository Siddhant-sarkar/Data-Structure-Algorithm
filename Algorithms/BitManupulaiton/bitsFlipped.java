import java.io.*;
import java.util.*;

public class bitsFlipped{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int counter=0;
    a^=b;
    // System.out.println(a);
    while(a!=0){
      a-=(a&(-a));
      counter++;
    }
    System.out.println(counter);
  }

}