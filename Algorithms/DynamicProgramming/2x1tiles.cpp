#include<iostream>
#include<vector>
using namespace std;

int findWays(int n){
	vector<int>vr(n+1),hr(n+1);
	vr[1]=1;hr[1]=0;
	vr[2]=1;hr[2]=1;
	for(int i=3;i<=n;i++){
		vr[i]=vr[i-1]+hr[i-1];
		hr[i]=vr[i-2]+hr[i-2];
	}
	return *vr.rbegin() + *hr.rbegin();
}
int countWays(int n){
	vector<int>dp(n+1);
	int ans=0;
	dp[1]=1;
	dp[2]=2;
	for(int i=3;i<=n;i++){
		dp[i]=dp[i-1]+dp[i-2];
	}
	return *dp.rbegin();

}
int main(){
	int n;cin>>n;
	// cout<<findWays(n)<<endl;
	cout<<countWays(n)<<endl;
	return 0;
}