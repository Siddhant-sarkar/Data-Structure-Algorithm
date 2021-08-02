import java.io.*;
import java.util.*;

public class intersection{

public static void main(String[] args) throws Exception {
    int n1,n2;
    HashMap<Integer,Integer> mp=new HashMap();
    Scanner sc= new Scanner(System.in);
    n1=sc.nextInt();
    for(int i=0;i<n1;i++){
        int k=sc.nextInt();
        if(mp.containsKey(k)){
            mp.put(k,mp.get(k)+1);
        }else{
            mp.put(k,1);
        }
    }
    n2=sc.nextInt();
    for(int i=0;i<n2;i++){
        int k=sc.nextInt();
        if(mp.containsKey(k) && mp.get(k)>0){
            System.out.println(k);
            mp.put(k,mp.get(k)-1);
        }
    }

 }

}