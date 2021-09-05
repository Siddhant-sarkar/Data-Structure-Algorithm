import java.io.*;
import java.util.*;

public class printAllGold {

   private static class Pair {
      String psf;
      int i;
      int j;
      int val;

      public Pair(String psf, int i, int j,int val) {
         this.psf = psf;
         this.i = i;
         this.j = j;
         this.val=val;
      }
   }
   public static void print(int[][]dp){
      for(int i=0;i<dp.length;i++){
         for(int j=0;j<dp[0].length;j++){
            System.out.print(dp[i][j]+" ");
         }
         System.out.println();
      }
   }
   public static void solve(int[][] arr){
      int row=arr.length-1,col=arr[0].length-1;
      Pair max=null;
      int dp[][]= new int[arr.length][arr[0].length];
      for(int j=arr[0].length-1;j>=0;j--){
         for(int i=0;i<arr.length;i++){
            if(j==col) dp[i][j]=0;
            else if(i==0){
               dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1]);
            }else if(i==row){
               dp[i][j]=Math.max(dp[i][j+1],dp[i-1][j+1]);
            } else {
               dp[i][j]=Math.max(dp[i][j+1],Math.max(dp[i+1][j+1],dp[i-1][j+1]));
            }
            dp[i][j]+=arr[i][j];
            if(max==null|| max.val<dp[i][j]) max = new Pair(""+i,i,j,dp[i][j]);
         }
      }
      ArrayDeque<Pair> dq= new ArrayDeque<>();
      dq.add(max);
      while(dq.size()>0){
         Pair np= dq.removeFirst();
         int i=np.i;
         int j=np.j;
         int av=arr[i][j];
         if(j==col){
            System.out.println(np.psf);
         }else if(i==row || j==col){
            if(i==row){
               if(dp[i-1][j+1]==np.val-av) dq.add(new Pair(np.psf+" d1",i-1,j+1,dp[i-1][j+1]));
               if(dp[i][j+1]==np.val-av) dq.add(new Pair(np.psf+"  d2",i,j+1,dp[i][j+1]));
            }else{
               if(dp[i][j+1]==np.val-av) dq.add(new Pair(np.psf+" d2",i,j+1,dp[i][j+1]));
               if(dp[i+1][j+1]==np.val-av) dq.add(new Pair(np.psf+" d3",i+1,j+1,dp[i+1][j+1]));
            }
         }else{
               if(dp[i-1][j+1]==np.val-av) dq.add(new Pair(np.psf+" d1",i-1,j+1,dp[i-1][j+1]));
               if(dp[i][j+1]==np.val-av) dq.add(new Pair(np.psf+" d2",i,j+1,dp[i][j+1]));
               if(dp[i+1][j+1]==np.val-av) dq.add(new Pair(np.psf+" d3",i+1,j+1,dp[i+1][j+1]));
         }
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         String str = br.readLine();
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(str.split(" ")[j]);
         }
      }
      solve(arr);

   }


}