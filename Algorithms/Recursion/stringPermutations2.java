import java.io.*;
import java.util.*;

public class stringPermutations2 {

  public static void generateWords(int cc, String str, Character[] spots, HashMap<Character, Integer> lastOccurence) {
    if(cc==str.length()){
      // System.out.println("we were here");
      for(int i=0;i<spots.length;i++){
        System.out.print(spots[i]);
      }
      System.out.println();
      return;
    }
    char crr= str.charAt(cc);
    for(int i=0;i<spots.length;i++){
      if(spots[i]==null && i>lastOccurence.get(crr)){
        lastOccurence.put(crr,i);
        spots[i]=crr;
        generateWords(cc+1,str,spots,lastOccurence);
        spots[i]=null;
        lastOccurence.put(crr,-1);
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Character[] spots = new Character[str.length()];
    HashMap<Character, Integer> lastOccurence = new HashMap<>();
    for(char ch: str.toCharArray()){
      lastOccurence.put(ch, -1);
    }
    generateWords(0, str, spots, lastOccurence);
  }

}