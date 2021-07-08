#include<iostream>
#include<vector>
using namespace std;

int friends(int m){
    vector<int>dp(m+1);
    dp[1]=1;
    dp[2]=2;
    for(int i=3;i<=m;i++){
        dp[i]=dp[i-1]+(i-1)*dp[i-2];
    }
    return *dp.rbegin();
}
int main(){
    int m;cin>>m;
    cout<<friends(m)<<endl;
    return 0;
}