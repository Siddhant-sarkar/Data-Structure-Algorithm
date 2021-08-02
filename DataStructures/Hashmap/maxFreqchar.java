import java.io.*;
import java.util.*;

public class maxFreqchar{

    public static void main(String[] args) throws Exception {
        HashMap<Character,Integer> mp=new HashMap<>();
        Scanner sc= new Scanner(System.in);

        String t= sc.nextLine();

        for(int i=0;i<t.length();i++){
            char c= t.charAt(i);
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)+1);
            }else{
                mp.put(c,1);
            }
        }
        int n=Integer.MIN_VALUE;
        char k='a';
        for(Character c: mp.keySet()){
            if(mp.get(c)>n) {
                k=c;
                n=mp.get(c);
            }
        }
        System.out.println(k+"");

    }

}