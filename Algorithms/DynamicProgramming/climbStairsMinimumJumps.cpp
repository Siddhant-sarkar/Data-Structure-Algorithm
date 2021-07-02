#include <iostream>
#include<climits>
#include<vector>
using namespace std;

int cs(vector<int>arr,int n){
    vector<int>dp(n+1,-1);
    dp[n]=0;
    for(int i=n-1;i>=0;i--){
        if(arr[i]>0){
            int mi=INT_MAX;
            for(int j=1;j<=arr[i];j++){
                if(dp[i+j]!=-1) mi=min(mi,dp[i+j]);
            }
            if(mi==INT_MAX){
                dp[i]=-1;
            }else{
                dp[i]=mi+1;
            }
        }
    }
    return dp[0];
}

int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i = 0 ; i < n ;i++){
        cin>>arr[i];
    }
    cout<<cs(arr,n)<<endl;
}