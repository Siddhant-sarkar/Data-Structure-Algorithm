class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int iclr=grid[row][col];
        dfs(row,col,color,grid[row][col],grid,new boolean[grid.length][grid[0].length]);
        return grid;
    }
    public void dfs(int i,int j,int clr,int iclr,int[][]grid,boolean[][]visited){
       if(i<0 || j<0 || i>=grid.length || j>=grid[0].length|| visited[i][j] || grid[i][j]!=iclr) return ;
       visited[i][j]=true;
        int count=0;
       if( i-1>=0 && grid[i-1][j]==iclr) count++;
       if( i+1<grid.length && grid[i+1][j]==iclr) count++;
       if( j-1>=0 && grid[i][j-1]==iclr) count++;
       if( j+1<grid[0].length && grid[i][j+1]==iclr) count++;
       dfs(i+1,j,clr,iclr,grid,visited);
       dfs(i-1,j,clr,iclr,grid,visited);
       dfs(i,j+1,clr,iclr,grid,visited);
       dfs(i,j-1,clr,iclr,grid,visited);
       if(count!=4) grid[i][j]=clr;
    }
}