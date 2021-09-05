import java.io.*;
import java.util.*;

public class printAllKnapsack {
    public static class Pair{
        int i;
        int j;
        int val;
        String asf;

        Pair(int i,int j,int val,String asf){
           this.i= i;
           this.j= j;
           this.val= val;
           this.asf= asf;
        }

    }
    public static void print(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solve(int[]values,int[]wt,int cap){
        int[][]dp= new int[wt.length+1][cap+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0) dp[i][j]=0;
                else{
                    dp[i][j]=dp[i-1][j];
                    if(j-wt[i-1]>=0){
                        dp[i][j]=Math.max(dp[i][j],dp[i-1][j-wt[i-1]]+values[i-1]);
                    }
                }
            }
        }
        System.out.println(dp[wt.length][cap]);
        ArrayDeque<Pair> pq= new ArrayDeque<>();
        pq.add(new Pair(wt.length,cap,dp[wt.length][cap],""));
        while(pq.size()>0){
            Pair np= pq.removeFirst();
            int i=np.i;
            int j= np.j;
            if(j==0 || i==0){
                System.out.println(np.asf);
                continue;
            }else{
                int no=dp[i-1][j];
                Integer yes=null;
                if(j-wt[i-1]>=0) {yes=dp[i-1][j-wt[i-1]];yes+=values[i-1];}
                if(yes==null) pq.add(new Pair(i-1,j,dp[i-1][j],np.asf));
                else if(no==yes){
                pq.add(new Pair(i-1,j,dp[i-1][j],np.asf));
                pq.add(new Pair(i-1,j-wt[i-1],dp[i-1][j-wt[i-1]],(i-1)+" "+np.asf));
                }else if(no>yes){
                pq.add(new Pair(i-1,j,dp[i-1][j],np.asf));
                }else{
                pq.add(new Pair(i-1,j-wt[i-1],dp[i-1][j-wt[i-1]],(i-1)+" "+np.asf));
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] values = new int[n];
        String str1 = br.readLine();
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(str1.split(" ")[i]);
        }

        int[] wts = new int[n];
        String str2 = br.readLine();
        for (int i = 0; i < n; i++) {
            wts[i] = Integer.parseInt(str2.split(" ")[i]);
        }

        int cap = Integer.parseInt(br.readLine());
        solve(values,wts,cap);
    }
}


                        


                        


                        