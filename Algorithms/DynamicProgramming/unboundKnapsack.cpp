#include<iostream>
#include<map>
#include<climits>
#include<vector>
using namespace std;

int maxvalue(int cap,vector<int>&val,vector<int>&sz){
	vector<int>dp(cap+1,0);
	for(int i=0;i<dp.size();i++){
		for(int j=0;j<val.size();j++){
			if(i-sz[j]>=0)
				dp[i]=max(dp[i],val[j]+dp[i-sz[j]]);
		}
	}
	return *dp.rbegin();
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