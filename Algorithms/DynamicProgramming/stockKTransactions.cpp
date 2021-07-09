#include<iostream>
#include<algorithm>
#include<climits>
#include<vector>
using namespace std;

int findTheProfit (vector<int>arr,int k){
    vector<vector<int>>dp(k+1,vector<int>(arr.size()));
    for(int i=1;i<k+1;i++){
        for(int j=0;j<arr.size();j++){
            int mod=INT_MIN;
            for(int k=0;k<j;k++){
                // mod=max(mod,dp[i-1][k]+dp[i-1][j])
                mod=max(mod,dp[i-1][k]+(arr[j]-arr[k]));
            }
            dp[i][j]=max(dp[i][j-1],mod);
        }
    }
    return *(*dp.rbegin()).rbegin();
}
int main(){
    int n,k;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++) cin>>arr[i];
    cin>>n;
    cout<<findTheProfit(arr,2)<<endl;
    return 0;
}
