import java.io.*;
import java.util.*;

public class kSelect2{

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
    combination(ustr,1, k,-1, "");
  }


  public static void combination(String ustr,int ssf,int ts,int last,String asf ) {
    if(ssf>ts){
      System.out.println(asf);
      return;
    }
    for(int i=last+1;i<ustr.length();i++){
      combination(ustr,ssf+1,ts,i,asf+ustr.charAt(i));
    }
  }

}