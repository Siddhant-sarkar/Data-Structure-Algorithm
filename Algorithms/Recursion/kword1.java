import java.io.*;
import java.util.*;

public class kword1 {

  public static void generate(int cc, String ustr,int ssf,int ts,Character spots[]){
    if(cc==ustr.length()){
      if(ssf==ts){
        for(int i=0;i<spots.length;i++){
          System.out.print(spots[i]);
        }
        System.out.println();
      }
      return;
    }
    char cr= ustr.charAt(cc);
    for(int i=0;i<spots.length;i++){
      if(spots[i]==null){
        spots[i]=cr;
        generate(cc+1,ustr,ssf+1,ts,spots);
        spots[i]=null;
      }
    }
    generate(cc+1,ustr,ssf,ts,spots);
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
    generate(0,ustr,0,k,new Character[k]);
  }

}