class Solution {
    public void print(int [][]dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int numEnclaves(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int ones=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1) {
                    if(grid[i][j]==1){
                        dfs(i,j,grid,visited);
                    }
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) ones++;
            }
        }
        return ones;
    }
    public void dfs(int i,int j,int[][]grid,boolean[][]visited){
       if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] || grid[i][j]==0){
           return;
       }
       visited[i][j]=true;
       dfs(i+1,j,grid,visited);
       dfs(i-1,j,grid,visited);
       dfs(i,j+1,grid,visited);
       dfs(i,j-1,grid,visited);
       grid[i][j]=0;
    }
}