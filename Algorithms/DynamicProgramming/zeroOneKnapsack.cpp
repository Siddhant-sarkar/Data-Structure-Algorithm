#include<iostream>
#include<map>
#include<climits>
#include<vector>
using namespace std;

int maxvalue(int cap,vector<int>&val,vector<int>&sz){
	vector<vector<int>>dp(val.size()+1,vector<int>(cap+1,0));
	for(int i=1;i<dp.size();i++){
		for(int j=1;j<dp[0].size();j++){
			if(j<sz[i-1]){
			dp[i][j]=dp[i-1][j];
			}else if(j>=sz[i-1]){
				dp[i][j]=max(dp[i-1][j],(dp[i-1][j-sz[i-1]]+val[i-1]));
			}
		}
	}
	for(auto it:dp){
		for(auto iit:it){
			cout<<iit<<"\t";
		}
		cout<<endl;
	}
	int ans=INT_MIN;
	for(int i=0;i<dp.size();i++) ans=max(ans,dp[i][dp[0].size()-1]);
	return ans;
}
int main(){
	int n; cin>>n;
	vector<int>val(n);
	vector<int>sz(n);
	for(int i=0;i<n;i++) cin>>val[i]; 
	for(int i=0;i<n;i++) cin>>sz[i];
	int cap;cin>>cap;
	cout<<maxvalue(cap,val,sz)<<endl;
	return 0;
}