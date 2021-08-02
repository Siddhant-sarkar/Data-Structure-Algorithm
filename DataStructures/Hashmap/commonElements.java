import java.io.*;
import java.util.*;

public class commonElements{
    public static void main(String[] args) throws Exception {
       int n1,n2; 
       Scanner sc = new Scanner(System.in);
       HashMap<Integer,Integer> mp=new HashMap<>();
       n1=sc.nextInt();
       for(int i=0;i<n1;i++){
        int k=sc.nextInt();
        mp.put(k,1);
       }

       n2=sc.nextInt();
       for(int i=0;i<n2;i++){
        int k=sc.nextInt();
        if(mp.containsKey(k)){
            System.out.println(k);
            mp.remove(k);
        }
       }
     }

}