import java.io.*;
import java.util.*;

public class kSelect1{
  static int total =0;

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    int k = scn.nextInt();

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }
    total=ustr.length();
    combination(0, ustr, 0, k, "");
  }


  public static void combination(int i, String ustr, int ssf, int ts, String asf ) {
    if(i==ustr.length()){
      if(ssf==ts)System.out.println(asf);
      return;
    }
    char c= ustr.charAt(i);
    combination(i+1,ustr,ssf+1,ts,asf+c);
    combination(i+1,ustr,ssf,ts,asf);
  }

}