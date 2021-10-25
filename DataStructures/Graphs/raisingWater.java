import java.util.*;
public class raisingWater{
    class Solution {
        public class Cell implements Comparable<Cell>{
            int x;
            int y;
            int wt;
            Cell(int x,int y,int wt){
                this.x=x;
                this.y=y;
                this.wt=wt;
            }
            @Override
            public int compareTo(Cell c){
                return this.wt-c.wt;
            }
        }
        public int swimInWater(int[][] grid) {
            int max=grid[0][0];
            int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
            PriorityQueue<Cell> pq = new PriorityQueue<>();
            boolean[][] visited= new boolean[grid.length][grid[0].length];
            pq.add(new Cell(0,0,grid[0][0]));
            while(pq.size()>0){
                Cell rm = pq.remove();
                if(visited[rm.x][rm.y]) continue;
                visited[rm.x][rm.y]=true;
                max=Math.max(max,grid[rm.x][rm.y]);
                if(rm.x==grid.length-1 && rm.y==grid[0].length-1){
                    break;
                }
                for(int i=0;i<dirs.length;i++){
                    int nx=rm.x+dirs[i][0];
                    int ny=rm.y+dirs[i][1];
                    if(nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length && visited[nx][ny]==false){
                        pq.add(new Cell(nx,ny,grid[nx][ny]));
                    }
                }

            }
            return max;
        }
    }
    public static void main(String[] args) {
        
    }
}