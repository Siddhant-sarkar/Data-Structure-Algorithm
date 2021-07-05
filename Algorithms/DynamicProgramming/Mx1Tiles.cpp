#include<iostream>
#include<vector>
using namespace std;

int countWays(int n,int m){
	vector<int>dp(n+1);
	for(int i=1;i<=n;i++){
		if(i==m) dp[i]=2;
		else if(i<m) dp[i]=1;
		else{
			dp[i]=dp[i-1]+dp[i-m];
		}
	}
	return *dp.rbegin();

}
int main(){
	int n,m;cin>>n>>m;
	cout<<countWays(n,m)<<endl;
}