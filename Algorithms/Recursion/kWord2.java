import java.io.*;
import java.util.*;

public class kWord2 {

 
  public static void generate(int ci,int ti,boolean []carr,String ustr,String asf){
    if(ci==ti){
      System.out.println(asf);
      return;
    }
    for(int i=0;i<ustr.length();i++){
      if(carr[i]==false){
        carr[i]=true;
        generate(ci+1,ti,carr,ustr,asf+ustr.charAt(i));
        carr[i]=false;
      }
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }
    generate(0,k,new boolean[ustr.length()],ustr,"");
   
  }

}