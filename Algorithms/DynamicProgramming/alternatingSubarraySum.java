class Solution {
    Long dp[][];
    public Long rec(int[] nums,int idx,int p){
        if(idx>=nums.length) return 0L;
        Long ans=0L;
        if(dp[idx][p]!=null) return dp[idx][p];
        if(p==0){
          ans=Math.max(ans,rec(nums,idx+1,1)+nums[idx]);
      }else if(p==1){
          ans=Math.max(ans, rec(nums,idx+1,0)-nums[idx]);
      }
      ans=Math.max(ans,rec(nums,idx+1,p));
      dp[idx][p]=ans;
      return ans;
  }
  public long tab(int[]nums){
    Long dp[][] = new Long[2][nums.length];
    dp[0][0]=nums[0];
    Long ans=0;
    for(int i=1;i<nums.length;i++){
       dp[0][i]=Math.max(dp[0][i-1],dp[1][i-1]+nums[i]);
       dp[1][i]=Math.max(dp[1][i-1],dp[0][i-1]+nums[i]);
       ans=Math.max(dp[0][i],dp[1][i]);
    }
    return ans;
  }

  public long maxAlternatingSum(int[] nums) {
      dp= new Long [nums.length][2];
      return rec(nums,0,0);
  }

}