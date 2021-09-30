class Solution {
    int tl=0;
    int dp[][];
    public int rec(int n,int si,int ei,int[]cuts){
        if(ei<=si) return 0;
        int ans=Integer.MAX_VALUE;
        if(dp[si][ei]!=0) return dp[si][ei];
        for(int i=si;i<ei;i++){
            int le=(si==0)?0:cuts[si-1];
            int re=(ei==cuts.length)?tl:cuts[ei];
            int sl=re-le;
            int lf= rec(le,si,i,cuts);
            int rf= rec(re,i+1,ei,cuts);
            ans=Math.min(ans,sl+lf+rf);
        }
        return dp[si][ei]=ans;
    }
    public int minCost(int n, int[] cuts) {
        dp = new int[cuts.length+1][cuts.length+1];
        tl=n;
        Arrays.sort(cuts);
        return rec(n,0,cuts.length,cuts);
    }
}