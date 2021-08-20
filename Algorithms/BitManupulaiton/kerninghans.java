import java.io.*;
import java.util.*;

public class kerninghans {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int counter=0;
    int rsb=n&-n;
    while(n!=0){
      n-=rsb;
      rsb=n&-n;
      counter++;
    }
    System.out.println(counter);
  }

}