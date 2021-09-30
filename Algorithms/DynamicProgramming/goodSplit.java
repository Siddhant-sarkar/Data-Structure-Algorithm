class Solution {
    public int numSplits(String s) {
        HashSet<Character> st= new HashSet<>();
        int dp[]= new int[s.length()];
        for(int i=0;i<dp.length;i++){
            st.add(s.charAt(i));
            dp[i]=st.size();
        }
        st = new HashSet<>();
        int dp2[] = new int[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            st.add(s.charAt(i));
            dp2[i] = st.size();
        }
        int ans=0;
        for(int i=0;i<dp.length-1;i++){
            if(dp[i]==dp2[i+1]) ans++;
        }
        return ans;
    }
}