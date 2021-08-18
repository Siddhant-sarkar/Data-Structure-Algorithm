import java.io.*;
import java.util.*;

public class kDupSel2 {

  public static void generate(int li,int cp,int ti,String asf,String ustr,HashMap<Character,Integer> fmap){
    if(cp==ti){
      System.out.println(asf);
      return;
    }
    for(int i=li;i<ustr.length();i++){
      char c=ustr.charAt(i);
      int fq= fmap.get(c);
      if(fq>0){
        fmap.put(c,fq-1);
        generate(i,cp+1,ti,asf+c,ustr,fmap);
        fmap.put(c,fq);
      }
    }

  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> unique = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.containsKey(ch) == false) {
        unique.put(ch, 1);
        ustr += ch;
      } else {
        unique.put(ch, unique.get(ch) + 1);
      }
    }
    generate(0,0,k,"",ustr,unique);
  }

}