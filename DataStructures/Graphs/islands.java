import java.io.*;
import java.util.*;

public class islands{
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }
      boolean[][] visited= new boolean [m][n];
      int total=0;
      for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
            if(visited[i][j]==false && arr[i][j]==0){
               getNumber(arr, i, j,visited);
               total++;
            }
         }
      }
      System.out.println(total);
   }
   static int islandss=0;
   public static void getNumber(int[][] arr, int sx, int sy,boolean [][] visited){
      if(sx<0|| sy<0 || sx>=arr.length|| sy>=arr[0].length
         ||arr[sx][sy]==1 || visited[sx][sy]==true){
         return;
      }
      visited[sx][sy]=true;
      getNumber(arr,sx+1,sy,visited);
      getNumber(arr,sx-1,sy,visited);
      getNumber(arr,sx,sy+1,visited);
      getNumber(arr,sx,sy-1,visited);
   }

}