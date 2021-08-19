import java.io.*;
import java.util.*;

public class kDupWords3{

 
  public static void generate(String str,String asf,int idx,int p,int ti,HashMap<Character,Integer>pmap,Character[] spots ){
    if(idx==str.length()){
      if(p==ti){for(int i=0;i<spots.length;i++){ System.out.print(spots[i]); } System.out.println();}
      return;
    }
    char ch=str.charAt(idx) ;
    int lo=pmap.get(ch);
    for(int i=lo+1;i<spots.length;i++){
      if(spots[i]==null){
        spots[i]=ch;
        pmap.put(ch,i);
        generate(str,asf+ch,idx+1,p+1,ti,pmap,spots);
        pmap.put(ch,lo);
        spots[i]=null;
      }
    }
    if(lo==-1){
      generate(str,asf,idx+1,p,ti,pmap,spots);
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());
    HashMap<Character,Integer> pmap= new HashMap<>();
    for(int i=0;i<str.length();i++){
      char c= str.charAt(i);
      if(!pmap.containsKey(c)){
        pmap.put(c,-1);
      }
    }
    // System.out.println(pmap);
    generate(str,"",0,0,k,pmap,new Character[k]);
  }

}