class Solution {
    static int presum[] ;
    static Integer dp[][];
    
    public static int rec(int[]stones,int i,int j){
        if(i>=j) return 0;
        if(i+1==j) return Math.max(stones[i],stones[j]);
        if(dp[i][j]!= null) return dp[i][j];
        // int stoneI=sum(stones,i+1,j) - rec(stones,i+1,j);
        // int stoneJ= sum(stones,i,j-1) - rec(stones,i,j-1);
        int stoneI = presum[j]-presum[i];
        int stoneJ = presum[j-1]-((i==0)?0:presum[i-1]);
        stoneI -= rec(stones,i+1,j);
        stoneJ -= rec(stones,i,j-1);
        return dp[i][j]=Math.max(stoneI,stoneJ);
    }
    public int stoneGameVII(int[] stones) {
        dp = new Integer[stones.length][stones.length];
        int n=stones.length;
        presum= new int[n];
        presum[0]=stones[0];
        for(int i=1;i<presum.length;i++) presum[i]+=presum[i-1]+stones[i];
        //return rec(stones,0,n-1);
        return tab(stones);
    }
    public void print(int [][]dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int tab(int[] stones){
        int n= stones.length;
        int dp[][] = new int[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(i>=j) dp[i][j]=0;
                else if(i+1==j) dp[i][j]=Math.max(stones[i],stones[j]);
                else{
                    int stoneI = presum[j]-presum[i];
                    int stoneJ = presum[j-1]-((i==0)?0:presum[i-1]);
                    stoneI-=dp[i+1][j];
                    stoneJ-=dp[i][j-1];
                    dp[i][j]=Math.max(stoneI,stoneJ);
                }
            }
        }
        //print(dp);
        return dp[0][dp[0].length-1];
    }
}