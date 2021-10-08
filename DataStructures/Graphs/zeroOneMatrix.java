class Solution {
    
    public class Pair{
        int i;
        int j;
        int d;
        Pair(int i,int j,int d){
            this.i=i;
            this.j=j;
            this.d=d;
        }
    }
    
    public int[][] updateMatrix(int[][] mat) {
        ArrayDeque<Pair> mq = new ArrayDeque<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
           for(int j=0;j<mat[0].length;j++){
              if(mat[i][j]==0){
                  mq.add(new Pair(i,j,0));
              }
           }
        }
        int[][] ans= new int[mat.length][mat[0].length];
        while(mq.size()>0){
           Pair rm= mq.remove() ;
           int i=rm.i;
           int j= rm.j;
           int d= rm.d;
           if(visited[i][j]) continue;
           visited[i][j]=true;
           ans[i][j]=d;
           if(i-1>=0 && !visited[i-1][j]) mq.add(new Pair(i-1,j,d+1));
           if(j-1>=0 && !visited[i][j-1]) mq.add(new Pair(i,j-1,d+1));
           if(i+1<mat.length && !visited[i+1][j]) mq.add(new Pair(i+1,j,d+1));
           if(j+1<mat[0].length && !visited[i][j+1]) mq.add(new Pair(i,j+1,d+1));
        }
       return ans;
    }
    
}
