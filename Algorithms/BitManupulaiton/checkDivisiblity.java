import java.io.*;
import java.util.*;

public class checkDivisiblity{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    int sum=0;
    for(int i=0;i<str.length();i++){
      int bit=str.charAt(i)-'0';
      if(i%2==0 && bit==1){
        sum+=2;
      }else{
        if(bit==1)  sum+=1;
      }
    }
    if(sum%3==0) System.out.println(true);
    else System.out.println(false);

  }

}