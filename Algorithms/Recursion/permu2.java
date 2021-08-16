import java.io.*;
import java.util.*;

public class permu2 {

  public static void permutations(int cb, int tb, int[] items, int ssf, int ts, String asf){
    if(cb>tb){
      if(ssf==ts){
        // printit(asf,"");
        System.out.println(asf);
      } 
      return;
    }
    for(int i=1;i<=ts;i++){
      if(items[i-1]==0){
        items[i-1]=1;
        permutations(cb+1,tb,items,ssf+1,ts,asf+i);
        items[i-1]=0;
      }
    }
    permutations(cb+1,tb,items,ssf,ts,asf+"0");

  }
  public static void printit(String s,String asf){
    if(s.length()==0){
      System.out.println(asf);
      return;
    }
    for(int i=0;i<s.length();i++){
      char c= s.charAt(i);
      String ros= s.substring(0,i)+s.substring(i+1);
      System.out.println(ros);
      printit(ros,asf+c);
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    // printit("abcd","");
    permutations(1, nboxes, new int[ritems], 0, ritems, "");
  }

}