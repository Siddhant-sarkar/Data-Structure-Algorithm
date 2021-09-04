import java.io.*;
import java.util.*;

public class printallPath {

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
   public static void print(int[][]arr){
      for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
      }
   }

   public static void solve(int[][]arr){
      int r=arr.length-1;
      int c=arr[0].length-1;
      int dp[][] =new int[arr.length][arr[0].length];
      for(int i=arr.length-1;i>=0;i--){
         for(int j=arr[0].length-1;j>=0;j--){
           if(i==r && j==c) dp[i][j]=0;
           else if(i==r || c==j) dp[i][j]=(i==r)?dp[i][j+1]:dp[i+1][j];
           else dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j]);
           dp[i][j]+=arr[i][j];
         }
      }
      System.out.println(dp[0][0]);
      ArrayDeque<Pair> dq= new ArrayDeque<>();
      dq.add(new Pair("",0,0,dp[0][0]));
      while(dq.size()>0){
         Pair np=dq.removeFirst();
         int av=arr[np.i][np.j];
         int i=np.i,j=np.j;
         if(i==r && j==c){
            System.out.println(np.psf);
         }else if(i==r|| c==j){
            if(i==r) dq.add(new Pair(np.psf+"H",i,j+1,dp[i][j+1]));
            else dq.add(new Pair(np.psf+"V",i+1,j,dp[i+1][j]));
         }else{
            if(dp[i+1][j]==np.val-av) dq.add(new Pair(np.psf+"V",i+1,j,dp[i+1][j]));
            if(dp[i][j+1]==np.val-av) dq.add(new Pair(np.psf+"H",i,j+1,dp[i][j+1]));
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