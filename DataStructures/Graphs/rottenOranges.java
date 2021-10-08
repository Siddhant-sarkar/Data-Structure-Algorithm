class Solution {
    public class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
        public String toString(){
           return 3*i+j+" ";
        }
    }
    public void print(int[][]grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        int ans=-1;
        int dp[][]={{1,0},{-1,0},{0,1},{0,-1}};
        ArrayDeque<Pair> mq = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) mq.add(new Pair(i,j));
                if(grid[i][j]==1) fresh++;
            }
        }
        while(mq.size()>0){
            int n=mq.size();
            while(n-->0){
                Pair p= mq.remove();
                int i=p.i,j=p.j;
                for(int l=0;l<4;l++){
                    int ni=i+dp[l][0];
                    int nj=j+dp[l][1];
                    if(ni>=0 && nj>=0 && ni<grid.length && nj<grid[0].length && grid[ni][nj]==1){
                        grid[ni][nj]=2;
                        mq.add(new Pair(ni,nj));
                        fresh--;
                    }
                }
            }
            ans++;
        }
        if(fresh>0) return -1;
        if(ans==-1) return 0;
        return ans;
        
    }
   
}