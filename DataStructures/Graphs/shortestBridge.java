import java.util.*;
class Solution {
    int dirs[][]={{1,0},{0,1},{-1,0},{0,-1}};
    ArrayDeque<Pair> mq = new ArrayDeque<>();
    public class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i= i;
            this.j= j;
        }
    }
    public int shortestBridge(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        boolean found=false;     
        for(int i=0;i<grid.length;i++){
            if(found) break;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid,visited);
                    found=true;
                    break;
                }
            }
        }
        print(visited);
        int lvl=0;
        while(mq.size()>0){
            int n=mq.size();
            while(n-- >0){
                Pair rm= mq.remove();
                int i=rm.i,j=rm.j;
                for(int[] d:dirs){
                    int ni=i+d[0],nj=j+d[1];
                    if(ni>=0 && nj>=0 && ni<grid.length && nj<grid[0].length && !visited[ni][nj]){
                        if(grid[ni][nj]==1) return lvl;
                        else{
                            visited[ni][nj]=true;
                            mq.add(new Pair(ni,nj));
                        }
                    }
                }
            }
            lvl++;
        }
        return -1;
    }
    public void dfs(int i,int j,int[][] grid,boolean[][] visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || visited[i][j]){
            return;
        }
        visited[i][j]= true;
        mq.add(new Pair(i,j));
        for(int[] d : dirs){
            int ni=i+d[0];
            int nj=j+d[1];
            dfs(ni,nj,grid,visited);
        }
    }
    public void print(boolean[][] visited){
        for(int i=0;i<visited.length;i++){
            for(int j=0;j<visited[0].length;j++){
                if(visited[i][j]) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

}