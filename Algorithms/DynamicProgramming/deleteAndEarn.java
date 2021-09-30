class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int mx=nums[nums.length-1];
        int freq[] = new int[mx+1];
        for(int i: nums) freq[i]++;
        int [] inc=new int[freq.length];
        int [] ex=new int[freq.length];
        int ans=0;
        for(int i=1;i<freq.length;i++){
           inc[i]=ex[i-1]+freq[i]*i;
           ex[i]=Math.max(inc[i-1],ex[i-1]);
            ans=Math.max(inc[i],ex[i]);
        }
        return ans;
    }
}