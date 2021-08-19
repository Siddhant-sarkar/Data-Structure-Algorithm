import java.io.*;
import java.util.*;

public class kDupWords4{

  public static void generate(String ustr,HashMap<Character,Integer> pmap,String asf,int idx,int k){
    if(idx==k){
      System.out.println(asf);
      return;
    }
    for(int i=0;i<ustr.length();i++){
      char c= ustr.charAt(i);
      int fq=pmap.get(c);
      if(fq>0){
        pmap.put(c,fq-1);
        generate(ustr,pmap,asf+c,idx+1,k);
        pmap.put(c,fq);
      }
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());
    String ustr="";
    HashMap<Character,Integer> pmap= new HashMap<>();
    for(int i=0;i<str.length();i++){
      char c= str.charAt(i);
      if(pmap.containsKey(c)){
        pmap.put(c,pmap.get(c)+1);
      }else{
        ustr+=c;  
        pmap.put(c,1);
      }
    }
    generate(ustr,pmap,"",0,k);
  }

}