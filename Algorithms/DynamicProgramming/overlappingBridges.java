import java.util.*;
import java.io.*;

public class overlappingBridges{
    public static class Bridge implements Comparable<Bridge>{
        int n;
        int s;
        Bridge(int n,int s){
            this.n= n;
            this.s=s;
        }
        public  int compareTo(Bridge o){
            if(this.n!=o.n) return this.n-o.n;
            else return this.s-o.s;
        }

    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        Bridge [] br= new Bridge[n];
        for(int i=0;i<n;i++){
            String line= sc.nextLine();
            String[] parts = line.split(" ");
            int nr= Integer.parseInt(parts[0]);
            int so= Integer.parseInt(parts[1]);
            Bridge b= new Bridge(nr,so);
            br[i]=b;
        }
        Arrays.sort(br);

        int[] dp= new int[n];
        int omax=0;
        for(int i=0;i<dp.length;i++){
            Integer max=null;
            for(int j=0;j<i;j++){
                if(br[i].s>br[j].s){
                    if(max==null || dp[j]>max) max=dp[j];
                }   
            }
            if(max==null) dp[i]=1;
            else dp[i]=max+1;

            if(dp[i]>omax){
                omax=dp[i];
            }
        }
        System.out.println(omax);
    } 
}