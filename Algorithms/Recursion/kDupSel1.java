import java.io.*;
import java.util.*;

public class kDupSel1 {
  
  public static void generate (int ci,int ti,String asf,String cList,HashMap<Character,Integer> fmap,int cp) {
    if(ci==cList.length()){
      if(cp==ti)System.out.println(asf);
      return;
    }
    char c = cList.charAt(ci);
    int fq = fmap.get(c);
    for(int i=fq;i>=0;i--){
      fmap.put(c,fq-i);
      String k="";
      for(int j=1;j<=i;j++) k+=c;
      generate(ci+1,ti,asf+k,cList,fmap,cp+i);
      fmap.put(c,fq);
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
    generate(0,k,"",ustr,unique,0);
  }

}