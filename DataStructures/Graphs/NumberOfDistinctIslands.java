import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumberOfDistinctIslands {

  public static  class Pair{
    int i;
    int j;
    Pair(int i,int j){
      this.i=i;
      this.j=j;
    }
  }

  public static HashSet<String> st = new HashSet<>();
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] st = br.readLine().split(" ");
    int n = Integer.parseInt(st[0]);
    int m = Integer.parseInt(st[1]);

    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      st = br.readLine().split(" ");
      for (int j = 0; j < m; j++) {
        arr[i][j] = Integer.parseInt(st[j]);
      }
    }

    System.out.println(numDistinctIslands(arr));

  }

  public static StringBuilder psf = new StringBuilder();

  public static int numDistinctIslands(int[][] arr) {
    boolean visited[][] = new boolean[arr.length][arr[0].length];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]==1 && !visited[i][j]) bfs(i,j,arr,visited,"s");
      }
    }
    // System.out.println(st);
    return st.size();
  }
  public static void bfs(int ni,int nj,int[][] grid,boolean[][]visited,String ans){
    Queue<Pair> mq= new LinkedList<>();
    mq.add(new Pair(ni,nj));
    while(mq.size()!=0){
      Pair rp= mq.remove();
      int i=rp.i;
      int j= rp.j;
      if(visited[i][j])  continue;
      visited[i][j]=true;

      if(i+1<grid.length && !visited[i+1][j] && grid[i+1][j]!=0){ans+="d";mq.add(new Pair(i+1,j));}
      if(i-1>=0 && !visited[i-1][j] && grid[i-1][j]!=0){ans+="u";mq.add(new Pair(i-1,j));}
      if(j+1<grid[0].length && !visited[i][j+1] && grid[i][j+1]!=0){ans+="r";mq.add(new Pair(i,j+1));}
      if(j-1>=0 && !visited[i][j-1] && grid[i][j-1]!=0){ans+="l";mq.add(new Pair(i,j-1));}
    }
    st.add(ans);
  }
















}